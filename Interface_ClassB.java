package opps_concept;

public class Interface_ClassB extends Interface_ClassA implements InterfaceA,InterfaceB
{
	@Override
	public void meth1()
	{
		System.out.println("InterfaceA Abstract Method Ovveridden");
	}
	@Override
	public void msg()
	{
		System.out.println("Java is Awesome !!!!!");
	}
	public void display()
	{
		System.out.println("InterfaceB Abstract Method Ovveridden");
	}
	public static void main(String[] args)
	{
		InterfaceA objA = new Interface_ClassB();
		objA.meth1();
		objA.msg();
		objA.meth2();
		
		InterfaceB objB = new Interface_ClassB();
		objB.display();
		
		new Interface_ClassB().greeting();
				
	}
}
