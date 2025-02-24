package pack1;

public class Class24sept1 
{
	void meth1(int num1,int num2)
	{
		int count=0;
		for(;num1<=num2;num1++)
		{
			if(num1%2==0)
			{
				System.out.println("Even Number : "+num1);
				count++;
			}
		}
		System.out.println("There are "+count+" even number");
	}
	void meth2(int num1,int num2)
	{
		int count=0;
		for(;num1<=num2;num1++)
		{
			if(!(num1%2==0))
			{
				System.out.println("Odd Number : "+num1);
				count++;
			}
		}
		System.out.println("There are "+count+" Odd number");
	}
	public static void main(String[] args)
	{
		new Class24sept1().meth1(1,100);
		new Class24sept1().meth2(1, 100);
	}
}
