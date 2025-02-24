package part_3_Java;

public class Final_keyword11Nov // Final classes can be inherite.
{
	final int i=10;// final variable are compile time constant
	
	final void meth1()//final method can not override ( but we can inherite it)
	{
		System.out.println("meth1 called ");
		//System.out.println(i++);
	}
}
