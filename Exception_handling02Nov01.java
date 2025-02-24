package part_3_Java;

public class Exception_handling02Nov01 extends Thread
{
	@Override
	public void run()
	{ int i;
		for(i=1;i<=5;i++)
		{
			System.out.println("run()executed :"+i);
		}
	}
	public static void main(String[] args) 
	{
		Exception_handling02Nov01 obj=new Exception_handling02Nov01();
		Thread t=new Thread(obj);
		t.start();
	}
}
