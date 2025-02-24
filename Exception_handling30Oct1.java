package part_3_Java;

import java.io.FileInputStream;
import java.util.Scanner;

public class Exception_handling30Oct1 
{
	Scanner sc= new Scanner(System.in);
	void meth1()
	{
		System.out.println(10);
		String name[]=new String[0];
		name[1]="Java";
		try 
		{
			System.out.println("try block excetuted");
			System.out.println("Please enter a number");
			System.out.println("===>"+20/sc.nextInt());
			System.out.println("length"+name[0].length());
			System.out.println("hello world");
		} 
		/*catch (ArithmeticException e)
		{
			System.out.println("1st catch block executed");
			e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			System.out.println("2nd catch block executed");
		}*/
		catch ( ArithmeticException|NullPointerException e)
		{
			System.out.println("Catch Block excuted");
			e.printStackTrace();
			
		}
		finally 
		{
			System.out.println("Finally block Executed");
			sc.close();
			
		}
		System.out.println(30);
	}
	void meth2()throws Exception
	{
		System.out.println("meth2 called");
		try(FileInputStream fiS=new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume")) 
		{
		 	System.out.println("Connection Created");
		} 
	}
	public static void main(String[] args)
	{
		Exception_handling30Oct1 Obj =new Exception_handling30Oct1();
		Obj.meth1();
		
	}
}
