package pack1;

public class ClassOP1 
{

	void meth1()
	{
		System.out.println("meth 1()called");
		int i=10;
		System.out.println(i);
		i++;
		System.out.println(i);
		i--;
		System.out.println(i+"\n");
		
		int num=100;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(++num);
	}
	void meth2()
	{
		System.out.println("meth2()called");
		int x= 50;
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		x++;
		System.out.println(++x);
		++x;
		System.out.println(--x);
		System.out.println(x);
		x--;
		System.out.println(x--);
		System.out.println(++x);
		System.out.println(x);
		
	}
	public static void main(String[] args)
	{
		ClassOP1 aobj= new ClassOP1();
		aobj.meth1();
		aobj.meth2();
		
		
	}
}
