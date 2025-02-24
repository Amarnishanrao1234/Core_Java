package part_3_Java;

public class Deadlock07Nov01
{
	public static void main(String[] args)
	{
		final String A = "Java";
		final String B = "Python";
		
		Thread t1= new Thread()
		{//Anonymous Inner class :- start here 
			@Override
			public void run()
			{
				synchronized (A) //Thread is holding java
				{
					System.out.println("Thread 1 locked on A");
					
					try 
					{
						Thread.sleep(100);
					} 
					catch (Exception e)
					{
						e.printStackTrace();
					}
					synchronized (B)// Thread will be waiting of B(python)
					{
						System.out.println("Thread 1 locked on B");
					}
					System.out.println("No Dead Lock");
				}
				
			}
			
		}//Anonymous inner class end here
		;
		
		Thread t2= new Thread()
		 {	//Anonymous Inner class :- start here 	
			@Override
			public void run()
			{
				synchronized (B)//Thread 2 is hold python
				{
					System.out.println("Thread 2 locked on B");
					try 
					{
						Thread.sleep(100);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					
				synchronized (A)//thread 2 will be waiting for A (java)
				{
					System.out.println("Thread 2 locked on A");
				}
					System.out.println("No DeadLock");
				}
			}
			
		 }
		;
		
		t1.start();
		t2.start();
	}
}
