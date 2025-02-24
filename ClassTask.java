package pack1;

public class ClassTask 
{
	static String h="***Start***";//static variable
	int n=58;//instance variable
	
	int meth1(int a,int b) //Parameterized method
	{
		System.out.println(a+b);//Arithematic operator
		System.out.println(a-b);//Arithematic operator
		System.out.println(a*b);//Arithematic operator
		System.out.println(a/b);//Arithematic operator
		return 500;//returning value
		
	}
	void meth2()//non-parameterized method
	{
		int x=78;//local variable
		int y=55;//local variable
		System.out.println(x++);//increment operator
		System.out.println(y--);//decrement operator
		if (x>y) 
		{
			System.out.println("Y is not greater the X ");
		}
		else
		{
			System.out.println("X is not greater the Y ");
		}
		
	}
	ClassTask(String S,int l)//constructor
	{
		System.out.println("It is parameterized Constructor");
		System.out.println(S+l);
	}
	public  ClassTask() 
	{
		System.out.println("Autoboxing");
		int i=54;
		Integer val=new Integer(i);
		System.out.println("int Primitive Data Type :"+i);
		System.out.println("integer wrapper class object :"+val);
		System.out.println(val);
		System.out.println("::::::::::::::::::::::::::::::");
		System.out.println("Auto_unboxing");
		Integer ival=new Integer(77);
		int i1=ival;
		System.out.println("integer wrapper class object :"+ival);
		System.out.println("int Primitive Data Type :"+i1);
	}
	
	static void meth3(String name,int age)//static method
	{
		System.out.println("Called static method");
		if (!(age>21||age<36))//logical operator and relation operator
		{
			System.out.println(name+"____");	
		}
		else 
		{
			System.out.println(age+"____");
		}
		
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println("Implicit typeCasting");
		int v=age;
		System.out.println(v);
		System.out.println("::::::::::::::::::::::::::::");
		System.out.println("Explicit typeCating");
		int k=50;
		byte b1=(byte)k;
		System.out.println(k);
	}
	static //Static block
	{
		System.out.println("Static Block::start ");
	}
	
	protected void finalize()
	{
		System.out.println("End");
	}
	public static void main(String[] args)
	{
		ClassTask obj= new ClassTask();//default constructor
		new ClassTask("Java", 17);//parameter pass in constructor
		obj.meth1(20, 15);
		obj.meth2();
		ClassTask.meth3("Logical", 15);
		System.out.println(obj.getClass());//getClass
		System.out.println(obj.hashCode());//hash code
		System.out.println(obj.equals(obj));//equal
		System.out.println(obj.toString());//to String
		System.gc();//finalize
		
	}

}
