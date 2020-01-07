//编译时就已经确定初始值的终极变量，相当于一个直接量，见P183

public class FinalLocalTest {

    public static void main(String[] args) {
        final var a = 5;//编译时就已经确定了初始值，将会将变量值当于一个直接量
        System.out.println(a);//a是一个宏变量，编译时不在使用变量地址的模式，而是直接将变量的值编译到字节码中
    }
}
