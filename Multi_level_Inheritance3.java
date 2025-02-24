package pack1;
import opps_concept.Multi_level_Inheritance2;

public class Multi_level_Inheritance3 extends Multi_level_Inheritance2
{
	void meth3()
	{
		System.out.println("Multi_level_Inheritance3 Method");
	}
	public static void main(String[] args)
	{
		Multi_level_Inheritance3 obj= new Multi_level_Inheritance3();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		
	}
}
