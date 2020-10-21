/**
 * 1.（选做）自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，然后自己分析一下对应的字节码，有问题群里讨论。
 *
 * @author peter.chen
 * @date 2020/10/21 19:29
 */
public class Hello {
    public static void main(String[] args) {
        boolean boolValue = true;
        if (boolValue) {
            System.out.println("Hi java !!");
        } else {
            System.out.println("Hi  jvm !!");
        }
        byte b = (byte) 0;
        b += 2;
        b = (byte) (2 + b);
        short s = -1;
        s += 2;
        s = (short) (s - 2);

        int i = 0;
        i = i - 100;
        i += 2;

        long l = 100;
        float f = 100.0f;
        double d = 100D;
        char c = 'a';
        String str = "float f = 100.0f;";
        System.out.println(str);

        int[] arr = {1, 2, 4};
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.printf("index=%d\n", i1 + 1);
        }
    }
}
