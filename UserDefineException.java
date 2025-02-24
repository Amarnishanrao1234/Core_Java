package part_3_Java;

import java.util.Scanner;

//Create  User Define Exception

public class UserDefineException
{
	static double current_balence=100;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to Withdrawal :");
		int n=sc.nextInt();
		
		try 
		{
			if(current_balence<n)
			{
				throw new MinimumAccountBalence("Have sufficient Balence Frist !!!");
			}
			else
			{
				System.out.println("please Take the Money :"+n);
			}
		}
		catch (MinimumAccountBalence e) 
		{
			System.out.println("Hi");
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
		}
	}
}
