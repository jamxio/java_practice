//错误重写父类方法，重写调用方式要一致，见P148

class BaseClass {

    public static void test() {

    }

    private void test2() {

    }
}

class SubClass extends BaseClass {

    public static void test2() {
        //本方法可以正常重写，是因为父类private方法对子类不可见
    }

    public void test() {

    }
}
