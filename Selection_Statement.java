package pack1;

public class Selection_Statement 
{
	void meth1(int a,int b,int c)
	{
		if (a>c) 
		System.out.println(a+"is bigger");
		else
		System.out.println(c+"is bigger");
			
		
		
		 if(b>c) 
				System.out.println(b+"is bigger");
				else
					System.out.println(c+"is bigger");
		 
		
				
			
	}
	public static void main(String[] args)
	{
		Selection_Statement obj=new Selection_Statement();
		obj.meth1(10, 20, 30);
		
	}
}
