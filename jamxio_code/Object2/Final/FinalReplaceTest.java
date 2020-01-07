//宏变量当作直接量存在于常量池里面使用，见P184

public class FinalReplaceTest {

    public static void main(String[] args) {
        final var a = 5 + 2;
        final var b = 1.2 / 3;//编译可直接获得值
        final var str = "疯狂" + "Java";
        final var book = "疯狂Java讲义：" + 99.0;
        final var book2 = "疯狂Java讲义：" + String.valueOf(99.0);//编译时不得知到book2运行时的值
        System.out.println(book == "疯狂Java讲义：99.0");//true，宏变量直接进入常量池，所以是同一个常量
        System.out.println(book2 == "疯狂Java讲义：99.0");//book2不是宏变量，运行时会有新开内存
    }
}
