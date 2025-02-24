package pack1;

public class ClassS6
{
	static int x= m1();
	public static void main(String[] args)
	{
		System.out.println(ClassS6.x);
	}
	static
	{
		System.out.println(x);
		ClassS6.x=x+20;
	}
	static int m1()
	{
		ClassS6.x =50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassS6.x);
		return 100;
	}
}
