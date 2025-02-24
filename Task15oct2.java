package pack1;

public class Task15oct2 
{
	public String makeAbba(String a,String b)
	{
		return a+b+b+a;
	}
	public static void main(String[] args)
	{
		Task15oct2 obj =new Task15oct2();
		String result=obj.makeAbba("Hi", "Bye");
		System.out.println(result);
	}
	
}
