package opps_concept;



public class Polymorphism_method_Overloading 
{
	public static  void meth1()
	{
		System.out.println(10);
	}
	void meth1(int i)
	{
		System.out.println(20);
	}
	private static void meth1(String s)
	{
		System.out.println(30);
	}
	static void meth1(int i,String s)
	{
		System.out.println(40);
	}
	protected void meth1(String s ,int i) 
	{
		System.out.println(50);
	}
	void meth1(StringBuffer sb )
	{
		System.out.println(60);
	}
	private void meth1(byte b)
	{
		System.out.println(70);
	}
	public static void main(String[] args)
	{
		Polymorphism_method_Overloading obj= new Polymorphism_method_Overloading();
		obj.meth1();
		obj.meth1(100);
		obj.meth1("java");
		obj.meth1(100, "java");
		obj.meth1("java", 100);
		obj.meth1(new StringBuffer("java"));
		obj.meth1((byte)10);
		System.out.println("------------------------");
		main();
		main("java is Awesome");
		
	}
	public static void main()
	{
		System.out.println("1st main Method");
	}
	public static void main(String s)
	{
		System.out.println("2nd main Method");
	}
	
	Polymorphism_method_Overloading()
	{
		
		System.out.println("Polymorphism_method_Overloading Default Constructor");
		System.out.println("-------------------------");
	}
	Polymorphism_method_Overloading(int x)
	{
		System.out.println("Polymorphism_method_Overloading Parameterized Contructor");
	}
}
