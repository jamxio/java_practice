
import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArrayMethodsTest {

    public static void main(String[] args) {
        var arr1 = new int[]{3, -4, 25, 16, 30, 18};

        Arrays.parallelSort(arr1);//并发排序
        System.out.println(Arrays.toString(arr1));

        var arr2 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left * right;
            }
            //left 代表新数组
        });
        System.out.println(Arrays.toString(arr2));
        var arr3 = new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * 5;
            }

            @Override
            public IntUnaryOperator compose(IntUnaryOperator before) {
                return IntUnaryOperator.super.compose(before); //To change body of generated methods, choose Tools | Templates.
            }
        });

        System.out.println(Arrays.toString(arr3));
    }
}
