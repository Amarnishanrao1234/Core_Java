package pack1;

public class ClassS2
{
	int x=10;
	public static void main(String[] args) 
	{
		System.out.println(new ClassS2().x);
	}
	static
	{
		int x=30;
		System.out.println(x+" ");
	}
}
