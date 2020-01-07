//自定义类的toString方法，用于打印对象，见书本P173
//使用打印时，会自动调用类的toString()方法

class Apple {

    private String color;
    private double weight;

    public Apple() {

    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String toString() {
        return "一个苹果，颜色是：" + color + "，重量是：" + weight;
    }
}

public class ToStringTest {

    public static void main(String[] args) {
        var a = new Apple("红色", 5.68);
        //打印Apple对象
        System.out.println(a);
    }
}
