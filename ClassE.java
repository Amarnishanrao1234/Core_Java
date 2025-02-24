package pack1;

public class ClassE
{
	void meth1(int a,String s)
	{
		System.out.println(a+a);
		System.out.println("a");
		System.out.println('a');
		System.out.println("s:"+s);
	
	}
	void meth2(int a,int b)
	{
		System.out.println(a*a);
		System.out.println(b);
		new ClassE().meth4("Java is Awsome");
		new ClassE().meth3('a',100);
		System.out.println(a-b);
	}
	void meth3(char c,int a)
	{
		System.out.println(c);
		System.out.println('c');
		System.out.println(a);
	}
	void meth4(String s)
	{
		new ClassE().meth1(10,"helloWorld");
		System.out.println(s);
	
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		new ClassE().meth2(5, 10);
		System.out.println("End");
		
	}

}
