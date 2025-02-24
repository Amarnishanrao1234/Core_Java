package pack1;
//Static Block
public class ClassA7 
{
	final static int x;
	
	static
	{
		x=50;
		System.out.println("1st static block called :"+x);
	}
	public static void main(String[] args)
	{
		System.out.println("main()called :"+x);
	}
	static
	{
		System.out.println("2nd static block called :"+x);
	}
}
