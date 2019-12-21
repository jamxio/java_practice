//类初始化块与实例初始化块对于对应变量的初始化顺序是一致的
//见P166

public class StaticInitTest {

    static {
        a = 6;
    }
    static int a = 9;

    static {
        a = 23;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
