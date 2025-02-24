package opps_concept;

public class Constructor_inheritance2 extends Constructor_inheritance1
{
	void meth2() 
	{
		System.out.println("Hello");
		super.meth1();
	}
	Constructor_inheritance2()
	{
		this("hello world");
		super.meth1();
		System.out.println("Constructor_inheritance2 default Constructor");
	}
	Constructor_inheritance2(String msg)
	{
		super(1000);
		System.out.println(msg);
	}
	public static void main(String[] args) 
	{
		Constructor_inheritance2 obj= new Constructor_inheritance2();
		Constructor_inheritance2 obj1 = new Constructor_inheritance2("Java is Awesome");
		obj.meth2();
		obj.meth1();
		obj1.meth1();
		
	}
}
