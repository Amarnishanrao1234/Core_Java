package pack1;
//TYPE CASTING
public class ClassTC
{
	void implicit()
	{
		System.out.println("Implementing implicit typecasting");
		byte b1=50;
		int i1=b1;
		System.out.println("\n byte value b1 :"+b1);
		System.out.println("int value i1 :"+i1);
		
		char c1='A';
		char c2='1';
		char c3=' ';
		int x1=c1;
		int x2=c2;
		int x3=c3;
		System.out.println("\n char value c1 :"+c1);
		System.out.println("int value x1 :"+x1);
		System.out.println("int value x2 :"+x2);
		System.out.println("int value x3 :"+x3);
		
		int num=100;
		float f= num;
		System.out.println("\n int value num :"+num);
		System.out.println("float value f :"+f);
		
	}
	
	void explicit()//explicit casting
	{
		System.out.println("Impliciting explicit casting");
		
		int i1=50;
		byte b1=(byte)i1;
		System.out.println("\n i1:"+i1);
		System.out.println("\n byte b1 :"+b1);
		
		float f=10.999f;
		byte b2 =(byte)f;
		System.out.println("\n float f :"+f);
		System.out.println("\n byte b2 :"+b2);
		
		int i2=500;
		byte b3=(byte)i2;
		System.out.println("\n value i2 :"+i2);
		System.out.println("\n value b3 :"+b3);//byte range -128 to 127
		
		/*minimumrange+(result-maxrange-1)
		 -128 to +(500-127-1)==>-128+(500-128)==>-128+372==>244
		 -128+(244-127-1)==>-128+(244-128)==>-128+116==>-12*/
		
		final int num=50;
		byte b4=num;
		
		
	}
	
	void meth1(byte b)
	{
		System.out.println("meth1()called");
		System.out.println("b value :"+b);
	}
	public static void main(String[] args)
	{
		ClassTC aobj= new ClassTC();
		aobj.implicit();
		System.out.println("--------------------------");
		aobj.explicit();
		System.out.println("---------------------------");
		aobj.meth1((byte)50);
	}
}
