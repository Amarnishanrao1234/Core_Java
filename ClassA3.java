package pack1;

public class ClassA3 
{
	void meth1(int i)
	{
		System.out.println("meth1()called");
		if (i<=65)
		{
			System.out.println("if block executed");
		}
		else 
		{
			System.out.println("else block executed");
		}
	}
	void checkEligibility(String name,int age)
	{
		System.out.println("welcome"+name+"!!!");
		if (age>=18) 
		{
			System.out.println(name+" you are eligible to vote !!!");
		}
		else
		{
			System.out.println(name+" you are Not eligible to vote"+(18-age)+"year");
			
		}
	}
	void checkExamEligibility(String name,int age)
	{
		System.out.println("welcome"+name+"!!!");
		if (!(age>=21==age<=35)) 
		{
			System.out.println(name+" you are eligible for Exam !!!");
		}
		else
		{
			System.out.println(name+" you are Not eligible ");
			
		}
		
	}
	public static void main(String[] args) 
	{
		ClassA3 aobj = new ClassA3();
		aobj.meth1('A');
		aobj.checkEligibility("Amar", 25);
		aobj.checkExamEligibility("AN", 55);
		
				
	}


}
