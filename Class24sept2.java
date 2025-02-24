package pack1;

public class Class24sept2 
{
	void display()
	{
		int a=10;
		for(int k=(a++)+(++a)+(++a);k>10;k++)
		{
			System.out.println(k);
			break;
		}
	}
	public static void main(String[] args)
	{
		new Class24sept2().display();
	}
}
