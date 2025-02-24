package pack1;

public class Selection_Statement6
{
	void Attendence(int classheld,int classattend)
	{
		double persent=((double)classattend/classheld)*100;
		
		System.out.println("Attendance Percentage :"+persent+"%");
	
		if (persent>=75) 
		{
			System.out.println("The student is Allowed to sit in exam");
		}
		else 
		{
			System.out.println("The student is Notallowed to sit in exam");
		}
		
	}
	public static void main(String[] args)
	{
		new Selection_Statement6().Attendence(100,78 );
	}
}
