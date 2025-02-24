package part_3_Java;

public class MethodRefferencing_ClassA_26Nov
{
	void display()
	{
		System.out.println("*****Implementiong Method-Referencing*****");
		
		//MethodRefferencing_InterfaceA_26Nov x=new MethodRefferencing_ClassB_26Nov()::msg;//Non_static Method Referencing
		//MethodRefferencing_InterfaceA_26Nov x= MethodRefferencing_ClassB_26Nov()::greeting;//Static Method Referencing
		MethodRefferencing_InterfaceA_26Nov x= MethodRefferencing_ClassB_26Nov::new;//Constuctor Referencing
		x.meth1();
	}
	public static void main(String[] args)
	{
		new MethodRefferencing_ClassA_26Nov().display();
	}
}
