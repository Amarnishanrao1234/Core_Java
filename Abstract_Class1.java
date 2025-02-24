package opps_concept;

public class Abstract_Class1 extends Abstract_Class
{
	@Override
	void meth1()
	{
		System.out.println("Abstract_Class meth1() implimented");
	}
	@Override
	String meth1(String data)
	{
		System.out.println(" All Abstract_Class implimented ");
		return data;
	}
	public static void main(String[] args)
	{
		Abstract_Class obj= new Abstract_Class1();
		obj.meth1();
		obj.meth2();
		System.out.println("===>"+obj.meth1("Java is awesome"));
		
	}
}
