//引用类型的终极变量，可以对指向的地址进行修改，但不可以修改指向其他地址，见P182

import java.util.Arrays;

public class FinalReferenceTest {

    public static void main(String[] args) {
        //数组变量也是引用
        final int[] iArr = new int[]{3, 5, 3, 4};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = -8;//可以直接对引用变量的地址操作
        System.out.println(Arrays.toString(iArr));
//        iArr = null;//改变变量引用的地址则是非法的
        final var p = new Person(45);
        p.setAge(23);
        System.out.println(p.getAge());

//        p = null;//只要是尝试修改引用变量指向的地址都是非法的操作
    }
}

class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
