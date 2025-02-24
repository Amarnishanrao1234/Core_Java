package opps_concept;

public class Polymorphism_method_Overriding1 extends Polymorphism_method_Overriding
{
	@Override
	protected void meth1()
	{
		System.out.println(10);
	}
	@Override
	public int meth2(int i)
	{
		System.out.println(20);
		return 100;
	
	}
	@Override
	public void meth3(int i,String s)
	{
		System.out.println(30);
	}
	static void meth4()
	{
		System.out.println(40);
	}
	@Override
	Polymorphism_method_Overriding1 meth5()
	{
		System.out.println(50);
		return new Polymorphism_method_Overriding1(); 
	}
	public static void main(String[] args)
	{
		Polymorphism_method_Overriding1 obj1 = new Polymorphism_method_Overriding1();
			obj1.meth1();
			System.out.println("--------------------");
		Polymorphism_method_Overriding1 obj2 = new Polymorphism_method_Overriding1();
			obj2.meth1();
			obj2.meth2(100);
			obj2.meth3(100, "java");
			obj2.meth4();
			obj2.meth5();
			
	}
}
