package pack1;

public class Task15oct8 
{
	public String doubleChar(String str)
	{
		String data = " ";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			data=data+str.charAt(i)+str.charAt(i);
			
		}
		return data;
		
	}
	public static void main(String[] args)
	{
		Task15oct8 obj=new Task15oct8();
		String result =obj.doubleChar("jack");
		System.out.println(result);
	}
}
