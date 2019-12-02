
public class Dog {

    public void jump() {
        System.out.println("正在执行jump方法");
    }

    public void run() {
        var d = new Dog();
        d.jump();
        System.out.println("正在执行run方法");
    }
    
    public void run(int a){
        this.jump();
        System.out.println("正在执行this.jump()和run");
    }
    public void run(Boolean a ){
        jump();
        System.out.println("正在执行jump(),和run()");
    }
}
