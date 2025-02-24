package part_3_Java;

public class Method_Local_Inner
{
	void meth1()
	{
		String s="Java";
		
		class Method_Local_InnerA
		{
			void msg1()
			{
				System.out.println(s.concat(" is awesome"));
			}
		}
		new Method_Local_InnerA().msg1();
		class Method_Local_InnerB
		{
			void msg2()
			{
				System.out.println(s.concat(" is Amazing"));
			}
		}
		new Method_Local_InnerB().msg2();
	}
	public static void main(String[] args)
	{
	  new Method_Local_Inner().meth1();	
	}
}
