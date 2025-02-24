package pack1;

public class Selection_Statement4
{
	void meth(char c)
	{
		if (c>=65 && c<=90)
		{
			System.out.println("Upper Case Alphabet");
		}
		else if (c>=97 && c<=122)
		{
			System.out.println("Lower Case Alphabet");
		}
	}
	public static void main(String[] args)
	{
		new Selection_Statement4().meth('E');
	}
}
