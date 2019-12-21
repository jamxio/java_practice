//instanceof运算，实例的编译时类型必须与instanceof 的右操作值（类或接口）存在继承关系
//见书本P156

public class InstanceTest {

    public static void main(String[] args) {
        //声明hello是使用Object类，则hello的编译类型是Object
        //Object是所有类的父类，但hello变量的实际类型是String
        Object Hello = "Hello";
        //String与Object类存在继承关系，可以进行instanceof运算。返回true
        System.out.println("字符串是否是Object类的实例：" + (Hello instanceof Object));
        System.out.println("字符串是否是String类的实例" + (Hello instanceof String));
        //Math 与 Object 存在继承关系，所以可以进行instanceof运算
        System.out.println("字符串是否是Math类的实例" + (Hello instanceof Math));//false

        System.out.println("字符串是否是Comparable接口的实例:" + (Hello instanceof Comparable));//true

        var a = "Hello";
        //a编译时类型为String,String与Object不存在继承关系，所以不允许进行instanceof运算
        System.out.println("字符传是否是Math类的实例:" + (a instanceof Math));
    }
}
