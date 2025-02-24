package pack1;

public class ClassS5
{
	static int i=10;
	static
	{
		display();
		System.out.println("frist static block"+i);
	}
	public ClassS5()
	{
		System.out.println("this id static flow");
	}
	public static void main(String[] args)
	{
		display();
		System.out.println("main method");
	}
	static void display()
	{
		System.out.println("this is display method");
	}
	static int j=20;
	static
	{
		new ClassS5();
		System.out.println("secod static block"+j);
	
	}
}
