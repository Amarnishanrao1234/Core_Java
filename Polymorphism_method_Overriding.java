package opps_concept;

public class Polymorphism_method_Overriding 
{
	void meth1()//overriden method
	{
		System.out.println("Class Polymorphism_method_Overriding meth1()");
	}
	public int meth2(int x)
	{
		System.out.println("Class Polymorphism_method_Overriding meth2()");
		return 0;
	}
	void meth3(int x,String s)
	{
		System.out.println("Class Polymorphism_method_Overriding meth3() ");
	}
	static void meth4()
	{
		System.out.println("Class Polymorphism_method_Overriding meth4()");
		
	}
	Polymorphism_method_Overriding meth5()
	{
		System.out.println("Class Polymorphism_method_Overriding meth5()");
		return new Polymorphism_method_Overriding();
	}
	
}
