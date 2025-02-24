package pack1;

public class Task15oct7
{
	public String fristHalf(String str)
	{
		return str.substring(0,str.length()/2);
		
	}
	public static void main(String[] args)
	{
		Task15oct7 obj=new Task15oct7();
		String result =obj.fristHalf("Hellothere");
		System.out.println(result);
	}
}
