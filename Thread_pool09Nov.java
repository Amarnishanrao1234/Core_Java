package part_3_Java;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Thread_pool09Nov extends Thread
{
	private String  msg;
	public  Thread_pool09Nov(String s)
	{
		this.msg=s;
	}
	@Override
	synchronized public void run()
	{
		System.out.println(Thread.currentThread().getName()+"(Beginig)message = "+msg);
		Process_Message();
		
		System.out.println(Thread.currentThread().getName()+"(Ending)message = ");
		Process_Message();
	}
	private void Process_Message()
	{
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(3);		
		for(int i=1;i<=5;i++)
		{
			Thread_pool09Nov tpdobj= new Thread_pool09Nov(" "+i);
			 Thread t = new Thread(tpdobj);
			 executor.execute(t);
		}
		executor.shutdown();
		while(!executor.isTerminated())
		{
			
		}
		System.out.println("finished all thread");
	}
}
