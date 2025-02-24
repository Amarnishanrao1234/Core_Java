package part_3_Java;

public class Multi_Threading05Nov03
{
	/* USED IN  THIS PROGRAM sleep() method	*/
	
	public static void main(String[] args)throws InterruptedException
	{
		System.out.println("J");
		Thread.sleep(5000);
		System.out.println("a");
		Thread.sleep(5000);
		System.out.println("v");
		Thread.sleep(5000);
		System.out.println("a");
		Thread.sleep(5000,500);
	}
}
