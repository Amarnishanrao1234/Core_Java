package pack1;
import java.util.Scanner;
public class Class26sept1 
{
	static  Scanner sc= new Scanner(System.in);
	void meth1()
	{
		System.out.println("---meth1()called---");
		System.out.println("Enter 1st Number");
		int x=sc.nextInt();
		System.out.println("value x: "+x);
		
		System.out.println("Enter 2nd Number");
		int y=sc.nextInt();
		System.out.println("Value y: "+y);
		
		int z=x+y;
		System.out.println("Value Z: "+z);
	}
	void checkEligibility(String name,int age)
	{
		System.out.println("Please enter the eligibility age for Vote");
		int valid_age=sc.nextInt();
		if(age>=valid_age)
		{
			System.out.println(name+"You are eligible to vote");
		}
		else
		{
			System.out.println(name+"you are eligible to vote after"+(valid_age-age+"year"));
		}
				
	}
	void empdetails()
	{
		System.out.println("---------Employee Details---------");
		
		System.out.println("name : ");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Department : ");
		String dept=sc.nextLine();
		
		System.out.println("Salary : ");
		int sal=Integer.parseInt(sc.nextLine());
		
		System.out.println("Address : ");
		sc.nextLine();
		String address=sc.nextLine();
		
		
		System.out.println("\n Details enter by user");
		System.out.println("empname : "+name);
		System.out.println("empdept : "+dept);
		System.out.println("empsal : "+sal);
		System.out.println("empaddress : "+address);
	}
	public static void main(String[] args) 
	{
		Class26sept1 obj = new Class26sept1();
		obj.meth1();
		System.out.println("what is your name");
		String uname=sc.next();
		System.out.println("enter your age");
		int uage=sc.nextInt();
		obj.checkEligibility("Amar", 24);
		System.out.println("--------------------------------------");
		obj.empdetails();
	}
}
