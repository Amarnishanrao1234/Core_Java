package pack1;

public class ClassAB 
{
	int meth1()
	{
		int a=10;
		a++;
		System.out.println(a++);
		a++;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a++);
		a--;
		System.out.println(--a);
		a=a++ +3;
		System.out.println("a value==>"+a);
		
		System.out.println(a++);
		--a;
		System.out.println(--a);
		System.out.println(a--);
		a=a-- +3;
		return a++ + ++a;
	
	}
	void meth2()
	{
		int a=10;
		int x= new ClassAB().meth1()+ a++;
		System.out.println(x++ + a++);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassAB().meth2();
		System.out.println("Java is Awesome");
		
	}

}
