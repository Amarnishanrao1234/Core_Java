package part_3_Java;

public class Anonymous_Inner_Class
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	public static void main(String[] args)
	{
		Anonymous_Inner_Class obj= new Anonymous_Inner_Class()
				{
					@Override
					void meth1()
					{
						System.out.println("hello world");
						super.meth1();
					}
				};
				obj.meth1();
	}
}
