//合理的实例equals案例，见P176

class Person {

    private String name;
    private String idStr;

    public Person() {

    }

    public String getIdStr() {
        return idStr;
    }

    public Person(String name, String idStr) {
        this.name = name;
        this.idStr = idStr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        System.out.println(obj instanceof Person);
        if (obj != null && obj.getClass() == Person.class) {
            var personObj = (Person) obj;
            if (this.getIdStr().equals(personObj.getIdStr())) {
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsRight {

    public static void main(String[] args) {
        var p1 = new Person("孙悟空", "123434343433");
        var p2 = new Person("孙行者", "123434343433");
        var p3 = new Person("孙悟饭", "+9151548");

        System.out.println(p1.equals(p2));//true
        System.out.println(p2.equals(p3));//false
    }
}
