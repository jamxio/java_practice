//代码块作用域，书本p129

public class BlockTest {

    public static void main(String[] args) {
        {
            //代码块局部变量a
            int a;
            System.out.println("代码块局部变量a的值：" + a);
            a = 5;
            System.out.println("代码块的局部变量a的值：" + a);
        }
        System.out.println("试图访问代码块里的a的值：" + a);
    }
}
