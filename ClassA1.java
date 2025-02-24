package pack1;

public class ClassA1
{
	void meth1()
	{
		int a =34;
		int b =21;
		int c = a++ + ++b;
		int d = --a + --b + c--;
		int e = a + +b + +c + d--;
		int f = -a + b-- + -c - d++;
		int sum = a + b + c + d + e + f;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args)
	{
		new ClassA1().meth1();
		
	}

}
