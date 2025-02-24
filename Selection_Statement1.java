package pack1;

public class Selection_Statement1
{
	void meth1(int L,int B)
	{
		if (L==B)
		{
			System.out.println("it is Square");
		}
		else
		{
			System.out.println("it is rectangle");
		}
	}
	public static void main(String[] args)
	{
		Selection_Statement1 obj=new Selection_Statement1();
		obj.meth1(45, 45);
	}
}
