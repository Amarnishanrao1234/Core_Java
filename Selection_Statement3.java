package pack1;

public class Selection_Statement3 
{
	void grade(int marks)
	{
		if (marks<25)
		{
			System.out.println("You Fail and Marks are :"+marks);
		}
		else if (marks>25 && marks<45)
		{
			System.out.println("Congrates !!!You Got E grade "+marks);
		}
		else if (marks>=45 && marks<50)
		{
			System.out.println("Congrates !!!You Got D grade "+marks);
		}
		else if (marks>=50 && marks<60)
		{
			System.out.println("Congrates !!!You Got c grade "+marks);
		}
		else if (marks>=60 && marks<80)
		{
			System.out.println("Congrates !!!You Got B grade "+marks);
		}
		else if (marks>=80) 
		{
			System.out.println("Congrates !!!You Got A grade "+marks);
		}
	}
	public static void main(String[] args)
	{
		new Selection_Statement3().grade(98);
	}
}
