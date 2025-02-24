package part_3_Java;

import java.io.FileReader;

public class Exception_handling30Oct2
{
	int avl_amt=10000;
	
	void with_draw(int wd_amt)
	{
		if (avl_amt<wd_amt)
		{
			throw new ArithmeticException("In sufficient Amount");
		}
		else
		{
			System.out.println("Transaction Sucsessfully complited");
			System.out.println("Plz take Cash : "+wd_amt);
		}	
	}
	public static void main(String[] args) throws Exception
	{
		Exception_handling30Oct2 obj=new Exception_handling30Oct2();
		obj.with_draw(30000);
		obj.FileOperations();
		
		
	}
	void FileOperations()throws Exception
	{
		System.out.println("Getting the Connection");
		FileReader fr=new FileReader("C:\\Users\\91937\\OneDrive\\Desktop\\Resume");
		System.out.println("Connection Created");
	}
	
}
