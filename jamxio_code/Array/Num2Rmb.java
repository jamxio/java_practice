
import java.util.Arrays;


public class Num2Rmb {

    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

    private String[] unitArr = {"十", "百", "千","万","十万"};

    private String[] divide(double num) {
        var zheng = (long) num;
        var xiao = Math.round((num - zheng) * 100);
        return new String[]{zheng + "", String.valueOf(xiao)};
    }

    private String toHanStr(String numStr) {
        var result = "";

        int numLen = numStr.length();
        for (var i = 0; i < numLen; i++) {
            var num = numStr.charAt(i) - 48;//ascii码转换

            if (i != numLen - 1 && num != 0) {
                //数字汉文拼接单位，零不读单位
                result += hanArr[num] + unitArr[numLen - 2 - i];
            } //否则不要单位
            else {
                result += hanArr[num];
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        var nr = new Num2Rmb();
        System.out.println(Arrays.toString(nr.divide(236711125.123)));
        System.out.println(nr.toHanStr("61009"));
    }
}
