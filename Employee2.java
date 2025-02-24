package part_3_Java;

public class Employee2 implements Comparable<Employee2>
{
	private String empName;
	private int empSalary;
	private String empDept;
	
	
	
	public Employee2(String empName, int empSalary, String empDept)
	{
		
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}

	@Override
	public String toString() 
	{
		return empName + " " + empSalary + " " + empDept ;
	}
	
	@Override
	public int compareTo(Employee2 o)
	{
		//return empSalary-o.empSalary;
		return empName.compareTo(o.empName);
	}
	
}
