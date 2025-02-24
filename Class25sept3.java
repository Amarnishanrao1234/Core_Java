package pack1;

public class Class25sept3
{
	void meth1(int b)
	{
		int a=10;
		while(a<=20)
		{
			if(a==15)
			{
				while(b<=30)
				{
					if(b==25)
					{
						break;
					}
					System.out.println("b value : "+b);
					b++;
				}
			}
			System.out.println("a value : "+a);
			a++;
		}
		System.out.println("----------------------------------------");
	}
	void meth2(int b)
	{
		int a=10;
		while(a<=20)
		{
			if(a==15)
			{
				while(b<=30)
				{
					if(b==25)
					{
						continue;
					}
					System.out.println("b value : "+b);
					b++;
				}
			}
			System.out.println("a value : "+a);
			a++;
		}
		System.out.println("------------------------------------------");
	}
	void meth3(int b)
	{
		int a=10;
		while(a<=20)
		{
			if(a==15)
			{
				while(b<=30)
				{
					if(b==25)
					{
						System.out.println("*******");
						return;
					}
					System.out.println("b value : "+b);
					b++;
				}
			}
			System.out.println("a value : "+a);
			a++;
		}
		System.out.println("-------------------------------------------");
	}
	public static void main(String[] args) 
	{
		Class25sept3 obj=new Class25sept3();
		obj.meth1(20);
		obj.meth2(20);
		obj.meth3(20);
	}
}
