//初始化块执行顺序，与变量定义时的初始化同级按语句顺序，见P62

public class InstanceInitTest {

    private InstanceInitTest(int a) {
        //无论构造器的位置在哪，构造器必须要初始化块执行之后执行
        this.a = 10;
    }

    //初始化按语句顺序执行，实例时会先为实例分配所有实例变量的空间，所以
    //实例初始化块可以直接使用实例变量
    {
        a = 6;
    }
    int a = 9;//a再次赋值会覆盖前面的初始化块

    private InstanceInitTest() {
        //当重载了，就必须自定义无参数构造器
    }

    public static void main(String[] args) {
        //代码将输出9
        System.out.println((new InstanceInitTest()).a);
        System.out.println((new InstanceInitTest(12)).a);
    }
}
