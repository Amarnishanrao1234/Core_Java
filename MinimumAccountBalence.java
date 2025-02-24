package part_3_Java;

//Create  User Define Exception


public class MinimumAccountBalence extends Exception
{
	String message;
	
	public MinimumAccountBalence(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}
}
