package opps_concept;

public class Hirarchical_Inheritence2 extends Hirarchical_Inheritence1
{
	public void meth2()
	{
		System.out.println("Hirarchical_Inheritence2 method");
	}
	public static void main(String[] args) 
	{
		Hirarchical_Inheritence2 obj= new Hirarchical_Inheritence2();
		obj.meth1();
		obj.meth2();
		
	}
}
