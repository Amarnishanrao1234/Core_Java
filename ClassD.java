package pack1;

public class ClassD
{
	void meth1()
	{
		ClassD obj1=new ClassD();
		obj1.meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
	}
	void main2()
	{
		int a=20;
		System.out.println(78-a);
	}
	void meth3()
	{
		int a=30;
		ClassD obj1=new ClassD();
		System.out.println(89+a);
		obj1.meth1();
		
	}
	void meth4()
	{
		System.out.println("10");
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}
	void meth5()
	{
		System.out.println(77);
		ClassD obj1=new ClassD();
		obj1.main2();
		System.out.println(99);
		
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		ClassD obj1=new ClassD();
		obj1.meth3();
		System.out.println("End");
		
	}
}


