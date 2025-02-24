package pack1;

public class This01sept2 
{
	void meth1()
	{
		meth4();//by default Compiler will add 'this'keyword.
		System.out.println("meth1()called");
	}
	static void meth2()
	{
		System.out.println("meth2()called");
	}
	void meth3()
	{
		this.meth2();//Warning bcoz the recommended way to local static method is by using ClassName.
		System.out.println("meth3()called");
	}
	void meth4()
	{
		System.out.println("meth4()called");
	}
	public static void main(String[] args)
	{
		This01sept2 obj=new This01sept2();
		obj.meth3();
		//this.meth3().C.E bcoz cant use 'this'inside the static area.
		obj.meth1();
	}
	
}
