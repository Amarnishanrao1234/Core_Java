package opps_concept;

public class TaskEncapsulation
{
	private String empName;
	private double empSal;
	private String empDept;
	private int empExp;
	private String empAddress;
	private double  empTotalsal;

	
	void meth1()
	{
		if(empExp>=10)
		{
			empTotalsal=empSal*30/100;
		}
	}
		
	
	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public double getEmpSal() 
	{
		return empSal;
	}

	public void setEmpSal(int empSal)
	{
		this.empSal = empTotalsal;
	}

	public String getEmpDept()
	{
		return empDept;
	}

	public void setEmpDept(String empDept)
	{
		this.empDept = empDept;
	}

	public int getEmpExp()
	{
		return empExp;
	}

	public void setEmpExp(int empExp)
	{
		this.empExp = empExp;
	}

	public String getEmpAddress()
	{
		return empAddress;
	}

	public void setEmpAddress(String empAddress) 
	{
		this.empAddress = empAddress;
	}

	public double getEmpTotalsal()
	{
		return empTotalsal;
	}

	public void setEmpTotalsal(int empTotalsal)
	{
		this.empTotalsal = empTotalsal;
	}


}
