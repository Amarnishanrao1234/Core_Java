package pack1;

public class ClassS7
{
	static int a=0;
	int b=0;
	
	public ClassS7()
	{
		a++;
		b++;
		System.out.println("Static variable ===>"+a);
		System.out.println("Instance variable ===>"+b);
		System.out.println("-------------------------");
	}
	void display()
	{
		System.out.println("*********Accessing static variable********");
		System.out.println(ClassS7.a);
		System.out.println(a);
		System.out.println(new ClassS7().a);
	}
	public static void main(String[] args)
	{
		new ClassS7();
		new ClassS7();
		new ClassS7();
		System.out.println("#######################################");
		new ClassS7().display();
	}
}
