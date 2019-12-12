//了解构造器的从继承树最顶层依次向下的调用顺序,见P152

class Creature {

    public Creature() {
        System.out.println("Creature无参数的构造器");
    }
}

class Animal extends Creature {

    public Animal(String name) {
        System.out.println("Animal带一个参数的构造器，"
                + "该动物的名字叫" + name);
    }

    public Animal(String name, int age) {
        this(name);//调用本类重载的构造器，继承的叫重写
        System.out.println("Animal带两个参数的构造器，"
                + "其age为" + age);
    }
}

public class Wolf extends Animal {

    public Wolf() {
        super("灰太狼", 3);//显示调用父类构造器
        System.out.println("Wolf无参数的构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}
