package part_3_Java;

public class Thread04nov extends Thread
{
	@Override
	public void run()
	{
		String name= Thread.currentThread().getName();
		int Priority= Thread.currentThread().getPriority();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+"("+Priority+")"+"has executed run():"+i);
		}
	}
	public static void main(String[] args) 
	{
		Thread04nov obj= new Thread04nov();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("firdt Thread");
		t2.setName("secound Thread");
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}
