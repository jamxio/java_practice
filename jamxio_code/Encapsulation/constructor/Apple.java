//多构造器之间的重复调用，需要用this(...args)的方式调用，见P145

public class Apple {

    public String name;
    public String color;
    public double weight;

    public Apple() {
        //一旦自定义了构造器，系统不再提供默认的构造器，所以需要定义一个空的构造器
    }

    public Apple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Apple(String name, String color, double weight) {
        //this.Apple(name,color);
        this(name, color);//构造器重用，必须是构造器中的第一条语句
        this.weight = weight;
    }
}
