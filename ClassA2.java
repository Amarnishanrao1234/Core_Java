package pack1;

public class ClassA2
{
	void meth1()
	{
		System.out.println("meth1()called");
		int x=7 ; int y=3;
		boolean isEqual = x ==y;
		boolean isGreaterThen = x > y;
		boolean isLessThan = x < y;
		boolean isNotEqual = x != y;
		
		System.out.println("Is Equal:"+isEqual);
		System.out.println("Is Greater Than:"+isGreaterThen);
		System.out.println("Is Less Than:"+isLessThan);
		System.out.println("Is Not Equal:"+isNotEqual);
			
	}
	void meth2()
	{
		System.out.println("\nmeth2()called");
		boolean p = true, q=false;
		boolean logicalAnd = p && q;
		boolean logicalOr = p || q;
		boolean logicalNotP = !p;
		boolean logicalNotQ = !q;
		 
		System.out.println("Logical AND:"+logicalAnd);
		System.out.println("Logical OR:"+logicalOr);
		System.out.println("Logical NOT of P:"+logicalNotP);
		System.out.println("Logical NOT of Q:"+logicalNotQ);
	}
	void meth3()
	{
		System.out.println("\nmeth3()called");
		int a=10;
		int b=5;
		
		//Assignment Operators
		int equalAssignment =a;
		int additionAssignment = a+= b;//equivalent to: a = a + b;
		int subtractionAssignment = a -= b;//equivalent to:a = a - b;
		int multiplicationAssignment = a *= b;//equivalent to: a = a * b;
		int divisionAssignment = a /= b;//equivalent to: a = a / b;
		
		System.out.println("Equal Assignment:"+equalAssignment);
		System.out.println("Addition Assignment:"+additionAssignment);
		System.out.println("Subtraction Assignment:"+subtractionAssignment);
		System.out.println("Multiplication Assignment:"+multiplicationAssignment);
		System.out.println("Division Assignment:"+divisionAssignment);
		
	}
	public static void main(String[] args)
	{
		ClassA2 obj = new ClassA2();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		
	}
}
