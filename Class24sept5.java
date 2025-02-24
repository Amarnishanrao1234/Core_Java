package pack1;

public class Class24sept5 
{
	String meth1(int a,int b,int c,int d)
	{
		if(a<=10)
		{
			System.out.println("Hi");
			if((a+b)==50)
				return "hi";
				return "hello";
		}
			else
				{
					if(c>=a)
					{
						if(true)
							return "Tuesday";
							return "Wensday";
					}
					else
					{
						if(d>0)
							System.out.println(d+" is Positive number");
						else if(d<0)
						{
							System.out.println(d+" is Negative number");
						}
						else
						{
							System.out.println(d+" is equal to Zero");
						}
						return "Java is Awsome";
					}
				}
		
		
	}
	public static void main(String[] args)
	{
		Class24sept5 obj=new Class24sept5();
		
		String result1 =obj.meth1(5, 45, 0, 0);
		System.out.println("meth1() is returning==>"+result1);
		
		String result2 = obj.meth1(11, 20, 30, -5);
		System.out.println("meth1() is returning==>"+result2);
		
		String result3 = obj.meth1(15, 20, 10, 5);
		System.out.println("meth1() is returning==>"+result3);
		
		String result4 = obj.meth1(0, 20, 30, 0);
		System.out.println("meth1() is returning==>"+result4);
		
		
		
	}
}
