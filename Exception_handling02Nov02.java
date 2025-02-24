package part_3_Java;

public class Exception_handling02Nov02 implements Runnable
{ 
	
	
	@Override
	public void run()
	{	int i;
		
		for(i=1;i<=5;i++)
		{
			System.out.println("Run()Executed :"+i);
		}
	}
	public static void main(String[] args) 
	{
		Exception_handling02Nov02 obj=new Exception_handling02Nov02();
		Thread t1=new Thread(obj);
		t1.start();
		/* whenever we are using start() a 'new' thread will be created and that 
		  new thread is responsiable for be running the run() present in Exception_handling02Nov02 
		  (beacause we are overriding)   */
		//t1.run();
		/* whenever we are using run() no 'new' thread will be created , 
		 run()present is Exception_handling02Nov02 will be executed just
		  like a normal method call (beacause we are overriding)*/
		
		Thread t2=new Thread();
		//t2.start();
		/* whenever we are using start()a 'new' thread is responsiable for running 
		 * the run() present in thread Class*/
		//t2.run();
		/*whenever we are calling run() no new thread will be created run() present in thread Class
		 will be executed just like a normal method call*/
	}
}
