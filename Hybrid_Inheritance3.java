package opps_concept;

public class Hybrid_Inheritance3 extends Hybrid_Inheritance2
{
	private void meth3()
	{
		System.out.println("Hybrid_Inheritance3 method");
		
	}
	public static void main(String[] args)
	{
		Hybrid_Inheritance3 obj=new Hybrid_Inheritance3();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}
