class DataWrap {

    int a;
    int b;
}

public class ReferenceTransferTest {

    public static void swap(DataWrap dw) {

        var tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap里，a的值为：" + dw.a + ";b的值为" + dw.b);
    }

    public static void main(String[] args) {
        var dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换后，a的值为：" + dw.a + ";b的值为：" + dw.b);
    }
}
