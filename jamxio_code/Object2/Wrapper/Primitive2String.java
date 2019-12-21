
public class Primitive2String {

    public static void main(String[] args) {
        var intStr = "123";
        //把一个特定字符串转换成int变量
        var it1 = Integer.valueOf(intStr);
        var it2 = Integer.parseInt(intStr);
        System.out.println(it1);
        var floatStr = "4.56";
        //把一个特定字符串转换成float变量
        var ft1 = Float.parseFloat(floatStr);
        var ft2 = Float.valueOf(floatStr);
        System.out.println(ft2);
        //把一个float变量转换成String变量
        var ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);

        //把一个double变量转换成String变量
        var dbStr = String.valueOf(3.344);
        System.out.println(dbStr);
        //把一个boolean变量转换成String变量
        var boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());

        new Primitive2String().testFloat2Int();
    }

    private void testFloat2Int() {
        System.out.println("浮点字符串转整型：" + Integer.valueOf("3.345"));
    }
}
