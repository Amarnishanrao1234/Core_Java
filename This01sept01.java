package pack1;

public class This01sept01
{
	int x=10;
	static int y=20;
	
	void meth1()
	{
		System.out.println("meth1()called");
		int x=999;
		int y=888;
		System.out.println("intance Variable x:"+this.x);
		System.out.println("Static Variable y:"+This01sept01.y);
		System.out.println("local Variable x:"+x+"y :"+y);
	}
	public static void main(String[] args) 
	{
		new This01sept01();
	}
}
