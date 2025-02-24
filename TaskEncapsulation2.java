package opps_concept;

import java.util.Scanner;

public class TaskEncapsulation2 
{
	Scanner sc=new Scanner(System.in);
	TaskEncapsulation obj= new TaskEncapsulation();
	
	void meth1()
	{
		System.out.println("Enter Employee Name ");
		obj.setEmpName(sc.nextLine());
		
		System.out.println("Enter Employee Salary ");
		obj.setEmpSal(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Employee Department");
		obj.setEmpDept(sc.nextLine());
		
		System.out.println("Enter Employee Experience");
		obj.setEmpExp(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Employee Address");
		obj.setEmpAddress(sc.nextLine());
		
		
		System.out.println("\n******Employee Details******");
		System.out.println("Employee Name : "+obj.getEmpName());
		System.out.println("Employee Salary : "+obj.getEmpSal());
		System.out.println("Employee Department : "+obj.getEmpDept());
		System.out.println("Employee Experience : "+obj.getEmpExp());
		System.out.println("Employee Address : "+obj.getEmpAddress());
		
	}
	public static void main(String[] args)
	{
		new TaskEncapsulation2().meth1();
		
	}
}
