package pack1;
//static Method
public class ClassA6
{
	int x =10;
	static int y =20;
	
	void meth1()
	{
		System.out.println("meth1()called");
		System.out.println("Instance Veriable :"+x);
		System.out.println("Static Variable :"+y);
		
	}
	static void meth2()
	{
		System.out.println("meth2()called");
		System.out.println("Instance Variable :"+new ClassA6().x);
	}
	public static void main(String[] args)
	{
		ClassA6 aobj =new ClassA6();
		aobj.meth1();
		System.out.println("***************************");
		aobj.meth2();
		meth2();
		ClassA6.meth2();
		
	}
	
}
