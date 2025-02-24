package pack1;

public class Class24sept4 
{
	void meth1(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}
	public static void main(String[] args)
	{
		new Class24sept4().meth1(10);
	}
}
