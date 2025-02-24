package part_3_Java;

public class Multi_Threading05Nov02 
{
	/* USED IN  THIS PROGRAM join() & yield() method	*/
	
	public static void main(String[] args) throws InterruptedException 
	{
		Multi_Threading05Nov01 obj= new Multi_Threading05Nov01();
		obj.start();
		//obj.join();
		Thread.yield();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class B main() :"+i);
		}
	}
}
