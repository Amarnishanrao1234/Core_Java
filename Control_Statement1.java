package pack1;

public class Control_Statement1 
{
	void meth1(int i)
	{
		System.out.println("---meth1()----");
		if (!(!(i<=100))) 
		{
			System.out.println("hi");
			System.out.println(i++ + ++i);
		}
		System.out.println("ivalue :"+i);
		System.out.println("meth1()execution completed");
	}
	void meth2(int i)
	{
		System.out.println("---meth2()---");
		if (i<=10) 
		{
			System.out.println("if block executed");
			//int x=100;//C.E because should not write declerative statement is this line
			System.out.println("hi");
			System.out.println("meth2()execution completed");
		}
	}
	String meth3(int i)
	{
		System.out.println("---meth3()---");
		if (i<=10)
		return "java is awesome";
		System.out.println("Hello world!!!");
		return "java is OOP language";
	}
	int meth4()
	{
		System.out.println("meth4()Called");
		return 100;
	}
	void meth5(int i)
	{
		System.out.println("---meth5()called---");
		
		if (i<=new Control_Statement1().meth4())
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
		System.out.println("meth5()execution completed");
	}
	void meth6(int i)
	{
		System.out.println("---meth6()---");
		if (true) 
		System.out.println("if block executed");
		else
		System.out.println("else block executed");
		System.out.println("meth6()execution completd");
	}
	void meth7(int i,int j)
	{
		if (i<=10)
		{
			System.out.println("if block executed");
			if(j%2==0)
				System.out.println(j+"is even");
			else 
				System.out.println(j+"is odd");
		}
		else 
		{
			System.out.println("else block executed");
		}
		System.out.println("meth7()execution comleted");
	}
	void meth8(int num)
	{
		System.out.println("---meth8()----");
		if (num>0)
			System.out.println(num+"is positive number");
		else if(num<0)
			System.out.println(num+"is negative number");
		else
			System.out.println(num+"is equal to 0");
		System.out.println("meth8()execution completed");
				
	}
	public static void main(String[] args) 
	{
		Control_Statement1 obj=new Control_Statement1();
			obj.meth1('A');
			obj.meth2(5);
			System.out.println("msg"+obj.meth3(10));
			obj.meth5('A');
			obj.meth6(100);
			obj.meth7(50, 100);
			obj.meth8(0);
	}
}
