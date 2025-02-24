package pack1;

public class Task15oct5 
{
	public String extraEnd(String str)
	{
		String s =str.substring(str.length()-2);
		return s+s+s;
	}
	public static void main(String[] args)
	{
		Task15oct5 obj=new Task15oct5();
		String result =obj.extraEnd("hello");
		System.out.println(result);
	}
}
