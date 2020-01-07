//Java常量池需保证字符串直接量只有一个，所以只要是编译时可以确定是值相等的字符串，则两个引用变量是相等的
//而如s6 = s2+ s3，虽然运行结果一样，但编译时并不把s6放进常量池，所以，不相等
//见P175

public class StringCompareTest {

    public static void main(String[] args) {
        var s1 = "疯狂Java";
        var s2 = "疯狂";
        var s3 = "Java";
        var s4 = "疯狂" + "Java";
        var s5 = "疯" + "狂" + "Java";
        var s6 = s2 + s3;
        var s7 = new String("疯狂Java");
        System.out.println(s1 == s4);//true
        System.out.println(s1 == s5);//true
        System.out.println(s4 == s5);//同为立即量，true
        System.out.println(s1 == s6);//false
        System.out.println(s1 == s7);//false
    }
}
