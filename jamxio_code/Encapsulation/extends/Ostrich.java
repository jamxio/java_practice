//子类扩展父类时，重写父类方法，见P147

public class Ostrich extends Bird {

    /**
     * 重写了父类Bird的fly()方法，因为我是鸵鸟不会飞
     */
    public void fly() {
        System.out.println("我只能在地上奔跑...");
    }

    public static void main(String[] args) {
        var os = new Ostrich();
        os.fly();
    }
}
