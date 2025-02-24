package pack1;
public class Class25sept4
{
	void meth()
	{
		int i=5;
		if(i<=5)
		{
			i++;
			System.out.println("i value : "+i);
			if(i==2)
			{
				System.out.println("***if block executed***");
			}
		}
		else
		{
			switch (i+2) 
			{
			case 8:
			{
				while(i<=8)
				{
					do 
					{
						for(;i<=8;i++)
						{
							System.out.println("else block executed");
						}
						System.out.println("i value : "+i);
					} while (i<=5);
				}
					
				break;
			}
			
			}
		}
	}
	public static void main(String[] args)
	{
		new Class25sept4().meth();
	}
}
