package pack1;

public class Selection_Statement7 
{
	void employee(int salary,int serYear)
	{
		double bonus=((double)salary*5)/100;
		if (serYear>5) 
		{
			System.out.println("bonus is : "+bonus);
			System.out.println("Normal salary : "+salary);
			System.out.println("Updated Salary : "+(bonus+salary));
		}
		else 
		{
			System.out.println("normal salary"+salary);
		}
	}
	public static void main(String[] args)
	{
		new Selection_Statement7().employee(45000, 10);
	}
	
	
}
