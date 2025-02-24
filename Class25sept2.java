package pack1;

public class Class25sept2 
{
	void meth1()
	{
		System.out.println("----meth1()called----");
		System.out.println("*using Break Statement*");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println("i value : "+i);
		}
		System.out.println("Compiler come out from loop");
	}
	void meth2()
	{
		System.out.println("----meth2()called----");
		System.out.println("*using Continue Statement*");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("i value : "+i);
		}
		System.out.println("Compiler come out from loop");
	}
	void meth3()
	{
		System.out.println("----meth3()called----");
		System.out.println("*using Return Statement*");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				return;
			}
			System.out.println("i value : "+i);
		}
		System.out.println("Compiler come out from loop");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Class25sept2 obj= new Class25sept2();
		obj.meth1();
		System.out.println("-------------------------------");
		obj.meth2();
		System.out.println("-------------------------------");
		obj.meth3();
		System.out.println("End");
	}
}
