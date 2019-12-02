
import java.util.*;
import java.sql.*;

public class ImportError {

    public static void main(String[] args) {
        System.out.println("导入的多个包中有同名类则会报错,引用不明确");
//        var date = new Date();
        //改用下面这句就可以了
        var date = new java.sql.Date(2019,12,3);
    }
}
