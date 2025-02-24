package pack1;

public class Task15oct1 
{
	public String helloName(String name) 
	{
		return "hello ".concat(name).concat("!");
	}
	public static void main(String[] args)
	{
		Task15oct1 obj = new Task15oct1();
		String result=obj.helloName("Bob");
		System.out.println(result);
	}
}
