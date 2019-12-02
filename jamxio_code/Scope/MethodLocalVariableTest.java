//方法局部变量，必须先声明后使用，p130

public class MethodLocalVariableTest {

    public static void main(String[] args) {
        int a;
        System.out.println("方法局部变量a的值：" + a);//因为局部变量必须显式初始化，成员变量都是隐式初始化

        a = 5;
        System.out.println("方法局部变量a的值：" + a);
    }
}
