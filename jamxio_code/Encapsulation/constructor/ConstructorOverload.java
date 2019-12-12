//构造器重载，可以多种方法实例化类，见书本P144

public class ConstructorOverload {

    public String name;
    public int count;

    public ConstructorOverload() {
        //空的构造方法
    }

    public ConstructorOverload(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        var oc1 = new ConstructorOverload();
        var oc2 = new ConstructorOverload(
                "轻量级Java EE 企业应用实战", 30000);
        System.out.println(oc1.name + " " + oc1.count);
        System.out.println(oc2.name + " " + oc2.count);
    }
}
