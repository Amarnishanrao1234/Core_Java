package part_3_Java;


public class Demon_Thread09Nov extends Thread
{
	@Override
	public void run()
	{
		int i=1;
		
		while(true)
		{
			i=i+1;
			System.out.println("i value :"+i);
		}
	}
	public static void main(String[] args) 
	{
		Demon_Thread09Nov obj= new Demon_Thread09Nov();
		Thread t1=new Thread(obj);
		t1.setDaemon(true);
	    t1.start();
	    
	    for(int i =1;i<=20;i++)
	    {
	    	System.out.println("main()"+i);
	    }
	}
}
