public class DivTest
{
	public static void main(String[] args)
	{
		var a = 5.2;
		double b = 3.1,div = a/b;
		// div ��ֵ����1.6774193548387097
		System.out.println(div);
		//����������Infinty
		System.out.println("5����0.0�Ľ���ǣ�"+5/0.0);
		//����������-Infinity
		System.out.println("-5����0.0�Ľ����:"+-5/0.0);
		//������뽫�����쳣
		//java.lang.ArithmeticException:/ by zero
		System.out.println("-5����0�Ľ���ǣ�"+5/0);
	}
}