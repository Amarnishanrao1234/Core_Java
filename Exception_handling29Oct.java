package part_3_Java;

public class Exception_handling29Oct
{
	void meth1()
	{
		System.out.println(10);
		
		try
		{
			
			System.out.println(20/0);
		}
		catch (Exception e)
		{
		
			//System.out.println(e.toString());//Name & reason of the Exception
			//System.out.println(e.getMessage());//Reason for Exception 
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println(30);
	}
	public static void main(String[] args)
	{
		new Exception_handling29Oct().meth1();
	}
}
