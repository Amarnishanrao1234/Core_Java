package part_3_Java;

public class ClassC
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Implenting Object Cloning \n");
		
		ClassA aobj1= new ClassA();
		System.out.println(aobj1.x+" "+aobj1.y);//10,20
		
		ClassA aobj2=aobj1;
		
		aobj1.y=1000;
		System.out.println(aobj1.x+" "+aobj1.y+"==>"+aobj2.y+"\n");
		
		ClassB bobj1=new ClassB();
		System.out.println(bobj1.a+" "+bobj1.b);
		
		ClassB bobj2= bobj1.CreateClone();
		bobj2.b=500;
		
		System.out.println(bobj1.a+" "+bobj1.b+"==>"+bobj2.b);
		System.out.println(bobj2.a);
	}
}
