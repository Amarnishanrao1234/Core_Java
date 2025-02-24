package pack1;
// Static variable
public class ClassA5 
{
	int x;
	static int y;
	public ClassA5()
	{
		x++;
		y++;
		System.out.println("Instance Variable:"+x);
		System.out.println("Static Variable:"+y);
	}
	public static void main(String[] args)
	{
		new ClassA5();
		new ClassA5();
		new ClassA5();
		
	}
}
