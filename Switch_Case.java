package pack1;

public class Switch_Case 
{
	void meth1(String name,int age,char gender)
	{
		System.out.println("Implementing Switch Case");
		final int i=40;
		byte b=60;
		
		switch(b+5)
		{
			case 10:
				System.out.println("case 10 executed");
				break;
			case 20:
				System.out.println("case 20 executed");
				break;
			case'A':
				System.out.println("case 65 executed");
				
				switch(gender)
				{
					case 'M','m':
						System.out.println("User is Male");
						if (age>=27) 
						{
							System.out.println(name+"Your Ready to Marriage");
						}
						else
						{
							System.out.println(name+"wait for few "+(27-age)+"more year");
						}
					case 'F','f':
						if (age>=25)
						{
							System.out.println(name+"Your Ready to Marriage");
						}
						else
						{
							System.out.println(name+"wait for few "+(25-age)+"more yaer");
							
							Default:
								System.out.println("invalied Data input");
								break;
						}
				}
			case i:
				System.out.println("case 40 executed");
			break;
			case 500:
				System.out.println("case 50 executed");
		
			Default:
				System.out.println("Invalid Input");
		}
		System.out.println("\n Compiler come out from switch case");
	}
	public static void main(String[] args)
	{
		new Switch_Case().meth1("Amar", 28, 'f');
	}
}
