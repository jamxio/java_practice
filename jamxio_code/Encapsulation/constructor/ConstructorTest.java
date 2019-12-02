//自定义构造器测试；见P143
public class ConstructorTest {

    public String name;
    public int count;

    public ConstructorTest(String name, int count) {
        System.out.println(this.count);
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        var tc = new ConstructorTest("疯狂Java讲义", 90000);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
