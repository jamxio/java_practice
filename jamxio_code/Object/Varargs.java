
public class Varargs {
    /**
     * 
     * @param a
     * @param books String... 可以收集字符串类型的可变数量参数
     */
    public static void test(int a, String... books) {
        for (var tmp : books) {
            System.out.println(tmp);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        var ara = new String[]{"", ""};
        test(5, "疯狂Java讲义", "轻量级Java EE 企业应用实战");
    }
}
