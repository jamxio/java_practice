//变量覆盖,成员变量不可以省略this或者className,见p130

public class VariableOverrideTest {

    private String name = "李刚";
    private static double price = 78.0;

    public static void main(String[] args) {
        var price = 65;
        System.out.println(price);
        System.out.println(name);//避免混淆成员变量不可以省略实例或类this. VariableOverride.
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();//居然可以不用括号括起来
    }

    public void info() {
        var name = "孙悟空";
        System.out.println(name);
        System.out.println(this.name);
        this.info2();//静态可以this访问
        info2();//也可以省略this
    }

    public static void info2() {
        info3();
    }

    public static void info3() {
        info4();//类方法不可以直接访问实例方法
    }

    public void info4() {

    }

}
