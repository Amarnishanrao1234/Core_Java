package part_3_Java;

public class Static_Inner 
{
	int x=10;
	static int y=20;
	
	static
	{
		System.out.println("Outer Class Static Block");
	}
	{
		System.out.println("Outer Class instance Block");
	}
	Static_Inner()
	{
		System.out.println("Outer Class Constructor");
	}
	class  Static_InnerA
	{
		void meth1()
		{
			System.out.println("Inner Class Method");
			System.out.println("Instance Variable :"+new Static_Inner().x);
			System.out.println("");
		}
		static
		{
			System.out.println("Inner Class Static Block");
		}
		{
			System.out.println("Outer Class instance Block");
		}
		public Static_InnerA()
		{
			System.out.println("Outer Class Constructor");
		}
		public static void main(String[] args)
		{
			System.out.println("Inner Class main()");
			//new Static_InnerA().meth1();
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Outer Class main()");
		//Static_Inner.Static_InnerA iobj= new Static_Inner.Static_InnerA();
		//iobj.meth1();
	}
}
