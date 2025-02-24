package pack1;

public class Task15oct9
{
	public boolean frontAgain(String str)
	{
		if(str.length()<2)
			return false;
		String front = str.substring(0,2);
		String end = str.substring(str.length()-2);
		return front.equals(end);
	}
	public static void main(String[] args)
	{
		new Task15oct9().frontAgain("AmarNishanrao");
	}
}
