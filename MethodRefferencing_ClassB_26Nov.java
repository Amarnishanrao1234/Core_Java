package part_3_Java;

public class MethodRefferencing_ClassB_26Nov
{
	void msg()
	{
		System.out.println("*****Non-Static Method Referencing*****");
	}
	
	static void greeting()
	{
		System.out.println("Good Morning Buddy");
		System.out.println("*****Static Method Referencing*****");
	}
	
	MethodRefferencing_ClassB_26Nov()
	{
		System.out.println("Constructor Referencing");
	}
}
