//重写实例方法equals，随便return true;不合理。见P176

class Person {

    public boolean equals(Object obj) {
        return true;//任何对象都equals
    }

}
//Dog空类

class Dog {
}

public class OverrideEqualsError {

    public static void main(String[] args) {
        var p = new Person();
        System.out.println("Person对象是否equals Dog对象？" + p.equals(new Dog()));
        System.out.println("Person对象是否equals String对象？" + p.equals(new String("Hello")));
    }
}
