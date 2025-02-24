package part_3_Java;

public class Thread_group_test08Nov01 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args)
	{
		Thread_group_test08Nov01 obj= new Thread_group_test08Nov01();
		ThreadGroup tg = new ThreadGroup("parent thread group");
		tg.setMaxPriority(10);
		
		Thread t1=new Thread(tg,obj,"one");
		t1.start();
		
		Thread t2=new Thread(tg,obj,"two");
		t2.start();
		
		Thread t3=new Thread(tg,obj,"three");
		t3.start();
		
		System.out.println("Active thread :"+tg.activeCount());
		System.out.println("Thread group name :"+ tg.getName());
	}
}
