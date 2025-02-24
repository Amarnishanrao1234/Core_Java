package pack1;

public class ClassA
{
		void meth1()
		{	
			System.out.println("\n meth1()called");
			System.out.println(10);
			System.out.println(20);
			System.out.println(30);
		
		}
		int meth2(int x)
		{
			System.out.println("\nmeth2()called");
			System.out.println(x+3);
			return 'A';
			
		}
		String meth3(int num1,int num2)
		{
			System.out.println("\nmeth3()called");
			if (num1<num2) 
			{
			  System.out.println("if block executed");
			  return"java is awsome";
			}
			else 
			{
			  System.out.println("else block is executed");
			  return"hello world";
			}
		}
		 ClassA meth4()
		{
			System.out.println("\nmeth4()called");
			return new ClassA();
		}
		public static void main(String[] args)
		{
			System.out.println("start");
			ClassA aobjA= new ClassA();
			aobjA. meth1();
			System.out.println("meth2()is returning:"+aobjA.meth2('a'));
			System.out.println("meth3()is returning:"+aobjA.meth3(5,1));
			System.out.println("meth4()is returning:"+aobjA.meth4());
			System.out.println("\n End");
		}
	}
