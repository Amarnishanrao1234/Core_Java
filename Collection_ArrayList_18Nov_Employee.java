package part_3_Java;

public class Collection_ArrayList_18Nov_Employee 
{
	private String empName;
	private int empSal;
	private String empDept;
	public Collection_ArrayList_18Nov_Employee(String empName, int empSal, String empDept)
	{
		
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
	@Override
	public String toString()
	{
		return empName+" "+empSal+" "+empDept;
	}
	
	
}
