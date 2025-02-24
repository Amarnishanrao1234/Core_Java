package part_3_Java;

public class Multi_Threading05Nov01 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class A :"+i);
		}
	}
}
