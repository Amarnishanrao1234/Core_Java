package part_3_Java;

public class Employee3
{
	private String empName;
	private int empsal;
	private String empAdd;
	
	
	
	public String getEmpName() 
	{
		return empName;
	}



	public int getEmpsal()
	{
		return empsal;
	}



	public String getEmpAdd()
	{
		return empAdd;
	}



	public Employee3(String empName, int empsal, String empAdd) 
	{
		
		this.empName = empName;
		this.empsal = empsal;
		this.empAdd = empAdd;
	}
	@Override
	public String toString()
	{
		return empName+" "+empsal+" "+empAdd;
	}
	
}
