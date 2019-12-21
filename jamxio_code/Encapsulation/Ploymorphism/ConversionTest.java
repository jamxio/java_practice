//强制类型转换，见P155
//子类对象可以直接赋值给父类变量，而强制转换只能从父类强制转换到子类，不存在继承关系的将会发生类型转换异常

public class ConversionTest {

    public static void main(String[] args) {
        var d = 13.4;
        var l = (long) d;//浮点强制转长整型
        System.out.println(l);
        var in = 5;
        //试图把一个数值类型的变量转换为boolean类型，下面代码编译出错
        //编译时会提示：不可转换的类型
        //var b = (boolean) in;
        Object obj = "Hello";
        //obj 变量的编译时类型为Object，Object与String存在继承关系，可以强制类型转换
        var objStr = (String) obj;
        System.out.println(objStr);
        //定以一个objPri变量，编译时类型为Object,实际类型为Integer
        Object objPri = Integer.valueOf(5);
        //objPri 变量的编译时类型为Object，objPri的运行时类型为Integer
        //Object 与 Integer存在继承关系
        //可以强制类型转换，而objPri变量的实际类型是Integer
        //所以下面将Integer转换成String代码运行时引发ClassCasgtException异常
        String str1;
        if (objPri instanceof String) {
            str1 = (String) objPri;
        }

        var 做吗 = "don't do";
        var res = 做吗 == "dome" && ConversionTest.test();
        res = 做吗 == "dome" & ConversionTest.test2();
        var str = (String) objPri;
    }

    static boolean test2() {
        System.out.println("done");
        return true;
    }

    static boolean test() {
        System.out.println("do me");
        return true;
    }
}
