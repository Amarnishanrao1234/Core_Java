package opps_concept;

public class Constructor_inheritance1
{
	void meth1()
	{
		System.out.println("Hiii");
	}
	public Constructor_inheritance1() 
	{
		System.out.println("Constructor_inheritance1 Default Constructor");
	}
	Constructor_inheritance1(int x)
	{
		System.out.println("Constructor_inheritance1 Parameterized Constructor"+x);
		this.meth1();
	}
}
