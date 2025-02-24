package part_3_Java;

public class Employee implements Comparable<Employee>
{

    private String empName;
	private int empSalary;
	private String empDept;
	
	
	
	public Employee(String empName, int empSalary, String empDept)
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
	public int compareTo(Employee o)
	{
		//return empSalary-o.empSalary;
       // return empName.compareTo(o.empName);
        return empDept.compareTo(o.empDept);
	}
}


