package opps_concept;

public class Inheritance2 extends Inheritance
{
	void meth2()
	{
		System.out.println("Class 2 Method");
		
	}
	public static void main(String[] args)
	{
		Inheritance obj1=new Inheritance();
		obj1.meth1();
		//obj.meth2();---> C.E
		
		Inheritance obj2=new Inheritance2();
		obj2.meth1();
		//obj.meth2()--->C.E
		
		Inheritance2 obj3=new Inheritance2();
		obj3.meth1();
		obj3.meth2();
		
		//Inheritance2 obj2=new Inheritance();//---> C.E
	}
}
