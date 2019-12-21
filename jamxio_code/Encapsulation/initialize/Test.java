//无论类初始化还是实例初始化，都必须在父类实例构造完后才能执行本类的初始化
//见P164

class Root {

    static {
        System.out.println("Root的类初始化块");
    }

    {
        System.out.println("Root的实例初始化块");
    }

    public Root() {
        System.out.println("Root的无参数的构造器");
    }
}

class Mid extends Root {

    static {
        System.out.println("Mid的类初始化块");
    }

    {
        System.out.println("Mid的实例初始化块");
    }

    public Mid() {
        System.out.println("Mid的无参数构造器");
    }

    public Mid(String msg) {
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值：" + msg);
    }

    public void Root() {
        //测试父类构造器同名方法
    }
}

class Leaf extends Mid {

    static {
        System.out.println("Leaf的类初始化块");
    }

    {
        System.out.println("Leaf的实例初始化块");
    }

    public Leaf() {
        //通过super调用父类中一个字符串参数的构造器
        super("疯狂Java讲义");
        System.out.println("执行Leaf的构造器");
    }
}

public class Test {

    public static void main(String[] args) {
        //首次调用（实例或静态调用）类的时候才执行类初始化
        //如果一直不使用该类，则不会发生类初始化
        new Leaf();
        new Leaf();
    }
}
