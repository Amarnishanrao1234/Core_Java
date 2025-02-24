package pack1;

public class Task15oct6 
{
	public String fristTwo(String str) 
	{
		if(str.length()>=2)
			return str.substring(0,2);
		else if (str.length()==1) 
			return str;
		else 
			return " ";
	}
	public static void main(String[] args)
	{
		Task15oct6 obj=new Task15oct6();
		String result =obj.fristTwo( "Amar");
		System.out.println(result);
	}
}
