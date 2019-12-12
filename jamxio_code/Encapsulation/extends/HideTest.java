//隐藏父类成员变量，见P150

class Parent {

    public String tag = "疯狂Java讲义";
}

class Derived extends Parent {

    private String tag = "轻量级Java EE企业应用实战";
}

public class HideTest {

    public static void main(String[] args) {
        var d = new Derived();
        System.out.println(d.tag);//私有的成员在类外部禁止访问
        System.out.println(((Parent) d).tag);//将输出属于Parent类的成员变量“疯狂讲义”
    }
}
