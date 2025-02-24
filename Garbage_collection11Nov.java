package part_3_Java;

public class Garbage_collection11Nov 
{
	public void meth1()
	{
		System.out.println("meth1 called ");
		
		Garbage_collection11Nov obj= new Garbage_collection11Nov();//all Object present inside a method is destroyed by 
		
	}
	@Override
	public void finalize()
	{
		System.out.println("Garbage has been collected ");
	}
	public static void main(String[] args) 
	{
		Garbage_collection11Nov obj1 = new Garbage_collection11Nov();
		Garbage_collection11Nov obj2 = new Garbage_collection11Nov();
		obj1.meth1();
		
		//System.out.println("obj1 :"+obj1.hashCode());
		//System.out.println("obj2 :"+obj2.hashCode());
		
		//obj1=null; //nullifiying the reference variable
		//obj1=obj2; // reassining the reference variable
		
		System.gc();
		
		//System.out.println("obj1 :"+obj1.hashCode());
		//System.out.println("obj2 :"+obj2.hashCode());
		
	}
}
