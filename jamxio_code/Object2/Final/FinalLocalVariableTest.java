//终极局部变量，可以声明时初始化，也可以先声明，后初始化，但只能初始化一次,见P182

public class FinalLocalVariableTest {

    public void test(final int a) {
        //不能对终极声明的形参进行重新赋值，下面语句非法
        // a = 5;
    }

    public static void main(String[] args) {
        final var str = "Hello";//终极局部变量,声明时同时赋值
        //str = "Java";//重新赋值非法
        final double d;
        d = 5.6;//终极变量声明后首次赋值，合法
        //d = 3.5;重复赋值非法
        new FinalLocalVariableTest().test(3);
    }
}
