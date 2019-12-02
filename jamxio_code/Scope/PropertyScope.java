//类变量与实例变量的比较，p128;
//类变量在第一次使用类的时候初始化类，分配内存并赋默认值
//实例变量在new 实例的时候初始化，分配对象的内存，读取并引用类内存，见p131

class Person {

    public String name;
    public static int eyeNum;
}

public class PropertyScope {

    public static void main(String[] args) {
        System.out.println("Person的eyeNum类变量的值：" + Person.eyeNum);

        var p = new Person();
        System.out.println("p 变量的name变量值是：" + p.name + " p对象的eyeNum变量值是：" + p.eyeNum);

        p.name = "孙悟空";
        p.eyeNum = 2;
        System.out.println("p 变量的name变量值是：" + p.name + " p对象的eyeNum变量值是：" + p.eyeNum);

        System.out.println("Person 的eyeNum类变量的值" + Person.eyeNum);

        var p2 = new Person();
        System.out.println("p2 对象的eyeNum类变量的值：" + p2.eyeNum);

    }
}
