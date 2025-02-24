package part_3_Java;

public class Lambda_expression_ClassB_26Nov
{
	void display()
	{
		System.out.println("*****Lambda Expresion*****");
		System.out.println("------Implementing Ways of Lambda Expression------ ");
		//Lambda_Expression_InterfaceA_26Nov x=(int i)->System.out.println("Value: "+i);//1st way 
		//Lambda_Expression_InterfaceA_26Nov x=(i)->System.out.println("Value: "+i);//2nd way
		Lambda_Expression_InterfaceA_26Nov x=i->System.out.println("Value: "+i);//3re way this will be not applicable for multiple parameters
		
		
		x.meth1(5);
	}
	public static void main(String[] args)
	{
		new Lambda_expression_ClassB_26Nov().display();
	}
}
