package pack1;

public class This01sept4
{
	void meth1()
	{
		System.out.println("Hello World");
	}
	public This01sept4()
	{
		this(100);
		this.meth1();
		System.out.println("This01sept4 default constructor");
	}
	This01sept4(int x)
	{
		System.out.println("This01sept4 Parameterized Constructor");
	}
	public static void main(String[] args)
	{
		new This01sept4();
	}
}
