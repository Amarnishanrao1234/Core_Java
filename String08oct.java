package pack1;

public class String08oct
{
	void meth1()
	{
		System.out.println("meth1()called");
		String s1="Java";
		String s2=new String("Java");
		char arr[]= {'j','a','v','a'};
		String s3=new String(arr);
		String s4=new String(arr,1,2);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		System.out.println("s1 : "+s1.length());
		System.out.println("s2 : "+s2.length());
		System.out.println("s3 : "+s3.length());
		System.out.println("s4 : "+s4.length());
	}
	void meth2()
	{
		System.out.println("meth2()called");
		String s="Java";
		System.out.println("Before s : "+s);
		//s.concat("is awesome");
		//s=s.concat("is awesome");
		System.out.println("After s : "+s);
		
	}
	public static void main(String[] args)
	{
		String08oct obj = new String08oct();
		obj.meth1();
		obj.meth2();
	}
}
