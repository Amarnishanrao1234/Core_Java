package pack1;

public class ClassA8
{
	static int x= ClassA8.meth1();
	static int meth1()
	{
		System.out.println("meth1()called");
		return 5000;
		
	}
	static
	{
		System.out.println("Static block called");
	}
	public static void main(String[] args)
	{
		System.out.println("main()called");
	}
}
