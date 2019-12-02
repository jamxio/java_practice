package lee;

public class HelloTest {

    public static void main(String[] args) {
        var h = new Hello();//可以直接访问同包下的类
        Hello.main(new String[]{});

        var a = new lee.sub.Apple();//测试子包类，子包也要写全包路径
        System.out.println("lee.sub.Appple子包类测试成功");
    }
}
