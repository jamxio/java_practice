public class ComparableOperatorTest
{
	public static void main(String[] a)
	{
		System.out.println("5>4.0£º"+(5>4.0));//true
		System.out.println("5==5.0£º"+(5==5.0));//true
		System.out.println("97=='a':"+(97=='a'));//
		System.out.println("true==false£º"+(true==false));//

		var t1 = new ComparableOperatorTest();
		var t2 = new ComparableOperatorTest();

		System.out.println("t1==t2£º"+(t1==t2));//
		var t3 = t1;
		System.out.println("t3 == t1£º"+(t1==t3));//

	}
}