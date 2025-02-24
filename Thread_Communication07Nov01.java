package part_3_Java;

public class Thread_Communication07Nov01
{
	int amount = 100;
	
	synchronized void with_draw(int amount)throws InterruptedException
	{
		if(this.amount<amount)
		{
			System.out.println("Insufficient balence");
			
			//wait(10000, 500);
			Thread.sleep(10000);
			
			System.out.println("Amount Credited");
			this.amount-=amount;
			System.out.println("Withdraw Successfull \n Balence is :"+this.amount);
		}
		else
		{
			this.amount-=amount;
			System.out.println("Withdraw Successfull \n Balence is :"+this.amount);
		}
	}
	synchronized void deposite(int amount)
	{
		this.amount+=amount;
		/*if(this.amount<=amount)
		{ 
			System.out.println("Deposite successfully \n balence is :"+this.amount);
		}
		else 
		{
			this.amount+=amount;
		}*/
		notify();
	    //notifyAll();
	}
}
