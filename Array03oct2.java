package pack1;
import java.util.Scanner;

public class Array03oct2
{
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		System.out.println("meth1()called");
		int arr[]= {11,22,33,44,55};
		System.out.println("\n Retriving the data by using for loop");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("\n Retriving the data by using for each loop");
		for(int data:arr)
		{
			System.out.println(data+" ");
		}
	}
	void ticketBooling()
	{
		System.out.println("Welcome to E-Ticket Booking");
		System.out.println("Which Movies you want to See");
		
		String movies_Name =sc.nextLine();
		
		System.out.println("How many Ticket you need for "+movies_Name+"?");
		String names[]=new String[sc.nextInt()];
		System.out.println("Please enter "+names.length+"name");
		
		for(int i=0;i<names.length-1;i++)
		{
			names[i]=sc.next();
		}
		System.out.println("Thank you for Entering name !!!");
		System.out.println("Now please Enter Row Between [A to Z]");
		
		String row=sc.next();
		
		System.out.println("Enter your Seat Number");
		int Seat_No=sc.nextInt();
		
		System.out.println("your ticket were booked for movie"+movies_Name);
		
		for(String data:names)
		{
			System.out.println(data+" "+row+" "+Seat_No);
		}
	}
	public static void main(String[] args)
	{
		Array03oct2 obj=new Array03oct2();
		//obj.meth1();
		obj.ticketBooling();
	}
}
