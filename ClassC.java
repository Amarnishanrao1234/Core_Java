package pack1;

public class ClassC 
{
	void meth1()
	{
		ClassC obj=new ClassC();
		System.out.println(10);
		obj.meth2();
		
	}
	void meth2()
	{
		System.out.println(20);	

	}
	void meth3()
	{
		int x=10;
		ClassC obj= new ClassC();
		obj.meth1();
		System.out.println(x-99);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("start");
		ClassC obj=new ClassC();
		obj.meth1();
		System.out.println("End");
		
	}
}

