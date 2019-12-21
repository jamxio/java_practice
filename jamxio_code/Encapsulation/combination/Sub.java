//继承会破坏封装，见P157

class Base {

    public Base() {
        test();//构造器调用会被子类重写的方法，在子类实例未创建又用到实例变量时会引发空指针异常
    }

    public void test() {
        System.out.println("将被子类重写的方法");
    }
}

public class Sub extends Base {

    private String name;

    public void test() {
        //被super实例调用时，this实例未创建，name变量未存在内存中
        System.out.println("子类重写父类的方法，其name字符传长度" + name.length());
    }

    public static void main(String[] args) {
        var s = new Sub();
    }
}
