//调用父类构造器，构造器里调用其他构造器必须在构造器内第一行。
//可以用super显式调用父类的某个构造器
//也可以用this(),如果当前构造器用了this，则本构造器不会调用父类构造器，由this()指向的构造器调用父类构造器
//默认在不用super和this调用其他构造器时，会隐式调用父类无参数的构造器

class Base {

    public double size;
    public String name;

    public Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}

public class Sub extends Base {

    public String color;

    public Sub(double size, String name, String color) {
        super(size, name);//调用父级构造器
        this.color = color;
    }

    public void tellYou() {

        this.size = 4.556;
        this.name = "hello world!";
        System.out.println(this.size + "  " + this.name);
        System.out.println(super.size + "  " + super.name);
    }

    public static void main(String[] args) {
        var s = new Sub(5.6, "测试对象", "红色");
        System.out.println(s.size + "——" + s.name + "--" + s.color);

        //测试未被覆盖的父类成员变量
        s.tellYou();

    }
}
