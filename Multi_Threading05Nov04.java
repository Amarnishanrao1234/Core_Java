package part_3_Java;

public class Multi_Threading05Nov04 extends Thread
{
	@Override
	public void run()
	{
		/* USED IN  THIS PROGRAM sleep() & interrupt() method	*/
		
		System.out.println("I am ready for interview ");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("this is my "+i+"interview");
		}
		System.out.println("I got placed , now i am relax now");
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (Exception e)
		{
			System.out.println("My sleep got distrurb");
		}
		System.out.println("time to go to office");
	}
	public static void main(String[] args)
	{
		Multi_Threading05Nov04 obj= new Multi_Threading05Nov04();
		Thread t= new Thread(obj);
		
		t.start();
		t.interrupt();
	}
}
