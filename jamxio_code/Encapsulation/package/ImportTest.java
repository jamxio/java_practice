package lee;
//开始使用import 简化类调用方式；见P140
import lee.sub.Apple;

public class ImportTest {
    public static void main(String[] args)
    {
        var a = new Apple();
        System.out.println("import 子包类lee.sub.Apple，并实例化成功");
    }
}
