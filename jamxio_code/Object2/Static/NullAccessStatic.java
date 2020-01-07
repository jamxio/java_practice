//null对象可以访问其所属类的类成员，类内部实例化可以直接使用静态方法，见P178

public class NullAccessStatic {

    private static void test() {
        System.out.println("static修饰的类方法");
    }

    private void test2() {
        System.out.println("null不可以访问实例方法，因为null不分配实例空间，所以不存在实例方法的指针");
    }

    public static void main(String[] args) {
        NullAccessStatic nas = null;
        nas.test();
        nas.test2();
    }
}
