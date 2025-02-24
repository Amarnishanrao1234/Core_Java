package pack1;

public class Task15oct4 
{
	public String makeOutWord(String out,String word) 
	{
		return out.substring(0,2)+word+out.substring(2);
		
	}
	public static void main(String[] args)
	{
		Task15oct4 obj=new Task15oct4();
		String result =obj.makeOutWord("<<>>", "Amar");
		System.out.println(result);
	}
}
