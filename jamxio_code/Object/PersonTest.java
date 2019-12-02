public class PersonTest
{
    public static void main(String[] args)
    {
        Person p;
        p = new Person();
        
        p.name = "李刚";
        
        p.say("Java 语言很简单，学习很容易！");
        
        System.out.print(p.name);
        var p2 = p;
        
    }
}