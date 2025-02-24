package opps_concept;
import java.util.Scanner;
//**********Encapsulation***************
public class ClassB 
{
	Scanner sc =new Scanner(System.in);
	ClassA aobj=new ClassA();
	
	void meth1()
	{
		System.out.println("Enter Employee Name : ");
		//String empName= sc.nextLine();
		//aobj.empName=sc.nextLine();
		aobj.setEmpName(sc.nextLine());
		
		System.out.println("Enter Employee Salary : ");
		//int empSal=sc.nextLine();
		//aobj.empSal=sc.nextLine();
		aobj.setEmpSal(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Employee Department : ");
		//String empDept= sc.nextLine();
		//aobj.empdDept=sc.nextLine();
		aobj.setEmpDept(sc.nextLine());
		
		System.out.println("\n ******Employee Details******");
		
		System.out.println("Employee Name : "+aobj.getEmpName());
		System.out.println("Employee Salary : "+aobj.getEmpSal());
		System.out.println("Employee Department : "+aobj.getEmpDept());
		
		
	}
	public static void main(String[] args)
	{
			new ClassB().meth1();
	}
}
