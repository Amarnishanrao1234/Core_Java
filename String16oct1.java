package pack1;
public class String16oct1 
{
	//********Difference between String V/S StringBuffer V/S StringBuilder******
	
	void meth1()
	{
		System.out.println(" **meth1()called** ");
		String s =new String("Java");
		
		StringBuffer buffer =new StringBuffer("Java");
		StringBuilder builder = new StringBuilder("Java");
		
		System.out.println("*****BEFORE MODIFICATION*****");
		System.out.println("s : "+s);
		System.out.println("buffer : "+buffer);
		System.out.println("builder : "+builder);
		
		s.concat(" is Awesome");
		buffer.append(" is Awesome");
		builder.append(" is Awesome");
		
		System.out.println("*****AFTER MODIFICATION*****");
		System.out.println("s : "+s);
		System.out.println("buffer : "+buffer);
		System.out.println("builder : "+builder);
	}
	void meth2()
	{
		System.out.println(" **meth2()called** ");
		String s1 =new String("Java");
		StringBuffer buffer1 =new StringBuffer("Java");
		StringBuilder builder1 = new StringBuilder("Java");
		
		
		String s2 =new String("Java");
		StringBuffer buffer2 =new StringBuffer("Java");
		StringBuilder builder2 = new StringBuilder("Java");
		
		System.out.println("------------------------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(buffer1.equals(buffer2));
		System.out.println(builder1.equals(builder2));
		
		System.out.println("-------------------------------------");
		
		System.out.println(s1==s2);
		System.out.println(buffer1==buffer2);
		System.out.println(builder1==builder2);
		
		//COMPARING THE CONTENTS PRESENT IN STRINGBUFFER & STRINGBUILDER
		
		System.out.println("--------------------------------------");
		
		System.out.println(buffer1.toString().equals(buffer2.toString()));
		System.out.println(builder1.toString().equals(builder2.toString()));
	}
	void meth3()
	{
		System.out.println(" ***meth3()called** ");
		
		StringBuffer sb= new StringBuffer();
		System.out.println("capacity : "+sb.capacity());
		sb.append("abcdefghijklmn");
		System.out.println("length : "+sb.length()+"\n");
		sb.append("opq");
		System.out.println("capacity : "+sb.capacity());
		System.out.println("length : "+sb.length()+"\n");
		
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
	public static void main(String[] args)
	{
		String16oct1 obj= new String16oct1();
		//obj.meth1();
		//obj.meth2();
		obj.meth3();
	}
}
