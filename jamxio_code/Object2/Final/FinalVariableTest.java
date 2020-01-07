//final变量初始化，见P180

public class FinalVariableTest {

    final int a = 6;//合法，成员变量
    //构造器或初始化块里分配初始值
    final String str;
    final int c;
    final static double d;

    //final char ch;//未正确初始化的final变量会出错
    {
        str = "Hello";//只要初始化就不会报错

//        a = 9;//修改final变量会报错
    }

    static {
        //静态也是只要初始化就不报错
        d = 5.6;
    }

    public FinalVariableTest() {
        c = 5;//构造器初始化也能初始化final变量
//        str = "world";//waring:可能已分配变量
    }

    {
        int u = 3;
    }

    public void changeFinal() {
//        d = 1.2;//任何时候都不可以修改一个默认值的final变量
//        ch = 'a';//不能在实例化后为final变量赋值初始化
    }

    public static void main(String[] args) {
        System.out.println(FinalVariableTest.d);//可以直接使用
        var ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.d);
    }
}
