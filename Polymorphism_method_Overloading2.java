package opps_concept;

public class Polymorphism_method_Overloading2 extends Polymorphism_method_Overloading1
{
	void display()
	{
		System.out.println("Hi");
		super.meth1();
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	Polymorphism_method_Overloading2()
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.meth4();
			break;
		}
		System.out.println("hello");
		System.out.println(show(50));
	}
	Polymorphism_method_Overloading2(int a)
	{
		System.out.println("==>"+(a+++show(50)));
	}
	public static void main(String[] args)
	{
		new Polymorphism_method_Overloading2().display();
	}
}
