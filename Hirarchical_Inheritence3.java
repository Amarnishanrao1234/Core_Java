package pack1;
import opps_concept.Hirarchical_Inheritence1;
public class Hirarchical_Inheritence3 extends Hirarchical_Inheritence1
{
	public void meth3()
	{
		System.out.println("Hirarchical_Inheritence3 Method");
	}
	public static void main(String[] args)
	{
		Hirarchical_Inheritence3 obj=new Hirarchical_Inheritence3();
		obj.meth1();
		obj.meth3();
	}
}
