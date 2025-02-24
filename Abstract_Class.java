package opps_concept;

public abstract class Abstract_Class 
{
	abstract void meth1();
	abstract String meth1(String s);
	
	void meth2()
	{
		System.out.println("meth2()Called");
	}
	static void meth3()
	{
		System.out.println("Abstract_Class Static meth3()");
	}
	Abstract_Class()
	{
		System.out.println("Abstract_Class default Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println(" Abstract_Class main() called");
		Abstract_Class.meth3();
	}
}
