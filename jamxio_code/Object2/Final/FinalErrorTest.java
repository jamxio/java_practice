//未初始化时不能使用变量值，final变量与普通变量一样，见P181

public class FinalErrorTest {

    final int age;

    {
        System.out.println(age);//此处未初始化age,故报错
        printAge();
        age = 6;
        System.out.println(age);
    }

    public void printAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        new FinalErrorTest();
    }
}
