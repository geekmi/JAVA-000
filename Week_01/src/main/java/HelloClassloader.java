import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 2.（必做）自定义一个 Classloader，加载一个 Hello.xlass 文件，执行 hello 方法，此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件。文件群里提供。
 *
 * @author peter.chen
 * @date 2020/10/21 20:12
 */
public class HelloClassloader extends ClassLoader {

    private final String path;

    public HelloClassloader(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Paths.get(path));
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) ((byte) 255 - bytes[i]);
            }
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
