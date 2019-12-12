//子类访问被隐藏的父类实例变量，见P149

class BaseClass {

    public int a = 5;

    public void accessOwner() {
        System.out.println("父类说a：" + a);
    }
}

public class SubClass extends BaseClass {

    public int a = 7;

    public void accessOwner() {
        super.accessOwner();
        System.out.println("子类说a：" + a);
    }

    public void accessBase() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        var sc = new SubClass();
        sc.accessOwner();
        sc.accessBase();
    }
}
