package part_3_Java;

public class Nested_inner 
{
	void msg()
	{
		System.out.println("Outer Class method");
	}
	{
		System.out.println("Outer Class Instance Block");
	}
	Nested_inner()
	{
		System.out.println("Outer Constructor");
	}
	class Nested_innerA
	{
		void meth1()
		{
			System.out.println("Inner Class method");
			msg();
		}
		{
			System.out.println("Inner Class Instance Block");
		}
		Nested_innerA()
		{
			System.out.println("Inner Constructor");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Outer Class main()");
		Nested_inner.Nested_innerA iobj=new Nested_inner().new Nested_innerA();
		iobj.meth1();
	}
}
