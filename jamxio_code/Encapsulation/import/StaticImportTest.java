//导入System的所有静态成员

import static java.lang.System.*;
import static java.lang.Math.*;//导入Math类所有的静态成员

public class StaticImportTest {

    public static void main(String[] args) {
        out.println(PI);//Math类的π，System类的out
        out.println(sqrt(256));
    }
}
