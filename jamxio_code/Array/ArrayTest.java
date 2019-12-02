
public class ArrayTest {

    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] intArr;
        intArr = new int[]{5, 6, 8, 20};
        int[] 数组简化 = {3, 4, 4, 5, 5};

        Object[] objectArr = new String[]{"Java", "李刚"};
        Object[] objectArr2 = new Object[]{"Java", "李刚"};
        ArrayTest at = new ArrayTest();
        (new ArrayTest()).main2();
        at.main2(true);
        
        at.main3((String[])objectArr);
    }

    /**
     * 
     */
    public void main2() {
        int[] intArr = new int[3];

        Object books = new String[5];

        System.out.println("tested main2");
    }

    public void main2(Boolean a) {
        System.out.print((new int[3]));
        System.out.println();
        System.out.print((new float[1]));
        System.out.println();
        System.out.print((new Boolean[2]));
        System.out.println();
        System.out.print((new char[5]));
        System.out.println();
        System.out.print((new String[4]));
        System.out.println();
        System.out.print((new Object[3]));
        System.out.println();
    }
    
    /**
     * 列出数组元素
     * @param arr 
     */
    public void main3(String[] arr){
        for(var i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        var a = new int[5];
        for(var i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        var str = new String[]{"","hello","3",null,null,null};
        for(String sstr:str){
           System.out.println(sstr);
        }
    }
}
