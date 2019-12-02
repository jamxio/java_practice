
public class PersonTest {

    public static void mian(String[] args) {
        var p = new Person();
        p.age = 1000;//报错，因为age已经私有private
        p.setAge(1000);//提示不合法

        System.out.println("未能设置age成员变量时：" + p.getAge());//应该时0，隐式初始化

        p.setAge(30);
        System.out.println("成功设置age成员变量后：" + p.getAge());//30

        p.setName("李刚");
        System.out.println("成功设置name成员变量后：" + p.getName());
    }
}
