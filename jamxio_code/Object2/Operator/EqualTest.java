//类型相等判断，不同实例不相等，可以使用.equals()方法，见P174

public class EqualTest {

    public static void main(String[] args) {
        var it = 65;
        var fl = 65.0f;
        System.out.println("65和65.0f是否相等" + (it == fl));//true
        var ch = 'A';
        System.out.println("65和'A'是否相等？" + (it == ch));//true
        var str1 = new String("hello");
        var str2 = new String("hello");
        System.out.println("Str1和Str2是否相等？" + (str1 == str2));//false
        System.out.println("Str1是否equals str2？" + (str1.equals(str2)));//true
        System.out.println("hello" == new String("hello"));
        System.out.println("hello" == "hello");
        var str3 = "hello";
        System.out.println("hello" == str3);
        var str4 = new String(str3);
        System.out.println(str4 == str3);
//        System.out.println("hello" == new EqualTest());//类型不存在继承关系，强制转换异常，编译出错
    }
}
