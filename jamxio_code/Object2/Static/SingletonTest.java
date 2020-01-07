
class Singleton {

    private static Singleton instance;

    private Singleton() {
        //构造器私有，不允许多例

    }

    /**
     * 一次构造一个实例，并持续使用
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);//true
    }
}
