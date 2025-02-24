package pack1;

public class Selection_Statement5
{
	void integer(int n)
	{
		if (n/2!=0) 
		{
			System.out.println(n+"Weird");
		}
		else {
			if (n>=2 && n<=5)
		{
			System.out.println(n+"Not Weird");
		}
		else if (n>=6 && n<=20)
		{
			System.out.println(n+"Weird");
		}
		else if (n>20)
		{
			System.out.println("Not Weird");
		}
		}	
	}
	public static void main(String[] args) 
	{
		new Selection_Statement5().integer(7);
	}
}
