package part_3_Java;

public class Thread_Communication07Nov02 
{
	public static void main(String[] args)
	{
		Thread_Communication07Nov01 obj= new Thread_Communication07Nov01();
		
		new Thread()//1st thread
		{//Anonymous Inner class start here
			@Override
			public void run()
			{
				try 
				{
					obj.with_draw(90);
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}//Anonymous Inner class END here
		.start();
		new Thread()//2nd thread
		{
			@Override
			public void run()
			{
				obj.deposite(200);
			}
		}
		.start();
	}
}
