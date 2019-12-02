
public class TwoDimensionTest {

    public static void main(String[] args) {
        int[][] a;
        a = new int[4][];//第二维也指定了长度
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.println(a[i]);
        }
        a[1] = new int[]{3};//a[1]，赋值一维数组{3}
        System.out.println(a[1].length);

        a[0] = new int[2];
        a[0][1] = 6;

        for (int i = 0, len = a[0].length; i < len; i++) {
            System.out.println(a[0][i]);
        }
    }

    public void initTwo() {
        int[][] a = new int[3][4];

        String[][] strArr = new String[][]{new String[3], new String[]{"Hello"}};

    }
}
