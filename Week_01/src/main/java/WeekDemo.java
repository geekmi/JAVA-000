import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 第一周作业
 *
 * @author peter.chen
 * @date 2020/10/21 19:29
 */
public class WeekDemo {
    public static void main(String[] args) {

        // 2.（必做）自定义一个 Classloader，加载一个 Hello.xlass 文件，执行 hello 方法，此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件。文件群里提供。
        HelloClassloader helloClassloader = new HelloClassloader(WeekDemo.class.getClassLoader().getResource("Hello.xlass").getFile());
        try {
            Class<?> helloClazz = helloClassloader.findClass("Hello");
            Object helloObj = helloClazz.newInstance();
            Method hello = helloClazz.getDeclaredMethod("hello");
            hello.invoke(helloObj);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
