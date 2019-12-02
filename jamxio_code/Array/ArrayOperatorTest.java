
import java.util.Arrays;

public class ArrayOperatorTest {

    public static void main(String[] args) {
        var a = new int[]{3, 4, 5, 6};

        var a2 = new int[]{3, 4, 5, 6};

        System.out.println("a数组和b数组是否相等：" + Arrays.equals(a, a2));
        //通过复制a数组的元素，生成一个新的b数组
        var b = Arrays.copyOf(a, 6);

        System.out.println("b数组的元素为：" + Arrays.toString(b));

        Arrays.fill(b, 2, 4, 1);//从第二下标到第四下标前一个填充1
        //将输出[3,4,1,1,0,0];
        System.out.println("b的数组元素为：" + Arrays.toString(b));

        Arrays.sort(b);

        System.out.println("b数组的元素为：" + Arrays.toString(b));
    }
}
