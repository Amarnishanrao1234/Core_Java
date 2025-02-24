package pack1;

public class ClassA4 
{
	int a;
	int b;
	int c;
	
	void meth1(int x,int y,int z)
	{ 
		a=x;
		b=y;
		c=z;
		
		System.out.println("Addtion:"+(a+b+c));
		new ClassA4();
		
	}
	void meth2(int a,int b)
	{
		System.out.println("subtraction:"+(b-a));
	}
	ClassA4(int a,int b)
	{
		System.out.println("multiplication:"+a*b);
	}
	public ClassA4()
	{
		int c=10;
		int a=10;
		System.out.println("division:"+c/a);
		
		
	}
	public static void main(String[] args)
	{
		ClassA4 aobjA4=new ClassA4(10, 20);
		aobjA4.meth1(10, 20, 30);
		aobjA4.meth2(10, 50);
	}
}
