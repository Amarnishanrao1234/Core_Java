package pack1;

public class Class24sept
{
	void meth(int num1,int num2)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1+"*"+i+"="+(num1*i));
			//System.out.println("-------------------------");
		}
		System.out.println("-------------------------");
	
	}
	public static void main(String[] args)
	{
		new Class24sept().meth(2,10);
	}
}
