package part_3_Java;

public class Synchronization_06Nov01 extends Thread
{
	@Override
	public void run()
	{
		criticalResource();
	}
	synchronized void  criticalResource()
	{
		String name= Thread.currentThread().getName();
		System.out.println(name+"has entered critical resource");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+"==>"+i);
		}
		System.out.println(name+"has completed is execution ");
	}
	public static void main(String[] args) 
	{
		Synchronization_06Nov01 obj=new Synchronization_06Nov01();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("tom thread");
		t2.setName("jerry thread");
		
		t1.start();
		t2.start();
	}
}
