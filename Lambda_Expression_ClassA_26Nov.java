package part_3_Java;

public class Lambda_Expression_ClassA_26Nov 
{
	void display()
	{
		System.out.println("******Implementing Lambda Expression*****");
		System.out.println("-------------------------------------------");

		//Lambda_Expression_InterfaceA_26Nov x=()->System.out.println("\n\n Hello World");
		//x.meth1();
		
		System.out.println("-------------------------------------------");
		
		Lambda_Expression_InterfaceB_26Nov y=(int num1,int num2)->System.out.println("Addition :"+(num1+num2));
		y.meth2(554, 454);
		
		System.out.println("-------------------------------------------");
		Lambda_Expression_InterfaceC_26Nov z=(int num3,int num4)->
		{
			if(num3<=10)
			{
				System.out.println("If Block executed");
				return num3+500;
			}
			else 
			{
				System.out.println("else Block Executed");
				return num4+1000;
			}
		};
		int result =z.meth3(56, 98);
		System.out.println("return value by meth3 is :"+result);
	}
	public static void main(String[] args)
	{
		new Lambda_Expression_ClassA_26Nov().display();
	}
}
