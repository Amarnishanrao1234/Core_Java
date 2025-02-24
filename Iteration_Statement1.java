package pack1;

public class Iteration_Statement1 
{
	void meth1()
	{
		int i=0,j=0;
		while (i<3)
		{
			do 
			{
				j++;
				System.out.println(j+" ");
			} while (j<2);
			i++;
		}
	}
	public static void main(String[] args)
	{
		new Iteration_Statement1().meth1();
	}
}
