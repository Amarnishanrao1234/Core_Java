package pack1;

public class This01sept3 
{
	public This01sept3 meth1()
	{
		System.out.println("meth1()called");
		return this;
	}
	public This01sept3 meth2()
	{
		System.out.println("meth2()called");
		return this;
	}
	void meth3() 
	{
		System.out.println("meth3()called");
	}
	public static void main(String[] args) 
	{
		new This01sept3().meth1().meth2().meth3();
	}
}
