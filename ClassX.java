package pack1;

public class ClassX
{
	String meth1( int a,int b,String d)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value=new ClassX().meth5();
		System.out.println(value);
		return "Java";
		
		
	}
	int meth2(int i)
	{
		System.out.println(75);
		int b=5;
		System.out.println(b);
		return (5*5)-b;
	}
	void meth3()
	{
		System.out.println("Start");
		System.out.println(new ClassX().meth4());
		System.out.println(40);
		
	}
	String meth4()
	{
		System.out.println("Today is Sunday");
		return new ClassX().meth1(8, 5, "abc");
		
	}
	int meth5()
	{
		ClassX obj=new ClassX();
		System.out.println(99);
		return obj.meth2(5);
	}
	public static void main(String[] args)
	{
		ClassX aobj = new ClassX();
		aobj.meth3();
		
	}

}
