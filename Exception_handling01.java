package part_3_Java;

public class Exception_handling01 
{
	void meth1()
	{
		System.out.println(10);
		
		try
		{
			System.out.println("Try Block");
			System.out.println(20/0);
		}
		catch (Exception e)
		{
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println(30);
	}
	public static void main(String[] args)
	{
		new Exception_handling01().meth1();
	}
}
