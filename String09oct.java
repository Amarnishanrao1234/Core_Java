package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class String09oct 
{
	void meth1()
	{
		 System.out.println("meth1()called\n");
		 
		 String s1="Java";
		 String s2=new String("Java");
		 String s3="Java";
		 String s4=new String("Java");
		 
		 //~~~~~~~~~~~~~~~~~~ equals()~~~~~~~~~~~~~~~~~~~~~~~~
		 System.out.println(s1.equals(s2));//T
		 
		 System.out.println(s2.equals("java"));
		 System.out.println("======>"+s2.equalsIgnoreCase("java"));
		 
		 System.out.println("java".equals("java"));
		 System.out.println(s2.equals(s3));
		 System.out.println(s4.equals(new String("Java")));
		 System.out.println(s1.equals(s3));
		 System.out.println(new String("Java").equals(new String("java"))+"\n");
		 
		 
		 //~~~~~~~~~~~~~~~~~~~~~ == ~~~~~~~~~~~~~~~~~~~~~~~~
		 
		 System.out.println(s1==s2);
		 System.out.println(s2==s4);
		 System.out.println(s3==s1);
		 System.out.println(s1==s4);
		 System.out.println(s1=="Java");
		 System.out.println("Java"=="Java");
		 System.out.println(s4==new String("Java"));
		 System.out.println(new String ("Java")==new String("Java"));
		 
	}
	
	void meth2() 
	{
		 System.out.println("meth2()called");
		 
		 String s1="Java";
		 System.out.println("length() : "+s1.length());
		 System.out.println("s1  : "+s1);
		 System.out.println("concat() :"+s1.concat("is Awesome"));
		 System.out.println(s1.concat("is Awesome").length());
		 System.out.println("s1 :"+s1);
		 
		 System.out.println("charArt() : "+s1.charAt(0));
		 System.out.println("chaeArt() : "+s1.charAt(s1.length()-2));
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your Gender");
		 char gender=sc.next().charAt(0);
		 
		 switch(gender)
		 {
			 case 'F','f':
				 System.out.println("User is Fe-male ");
			 	break;
			 case 'M','m':
				 System.out.println("User is male");
			 	break;
			 default: System.out.println("Invalied input");
			 
		 }
		 sc.close();
		 
		 System.out.println("Startwith() : "+s1.startsWith("ja"));
		 System.out.println("toLowecase() : "+s1.toLowerCase());
		 System.out.println("toUppercase() : "+s1.toUpperCase());
		 System.out.println("s1 :"+s1);
		 
		 //~~~~~~~~~~~~~~~~~~subString()~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 
		 String s2="Java is awesome";
		 System.out.println("subString() : "+s2.substring(8));
		 System.out.println("subString() : "+s2.substring(9,11));
		 System.out.println("SubString() : "+s2.substring(3,9));
		 
		 
		 System.out.println("replace() : "+s2.replace('a','A'));
		 System.out.println("s2 : "+s2);
		 
		 
		 String s3="hello World";
		 System.out.println("length of s3 : "+s3.length());
		 System.out.println("trim () : "+s3.trim().length());
		 
		 
		 System.out.println("indexof() : "+s3.indexOf('o'));
		 System.out.println("lastIndexOf() : "+s3.lastIndexOf('o'));
		 
		 
		 String date="9-oct-2024";
		 String arr1[]=date.split("-");
		 System.out.println(Arrays.toString(arr1));
		 
		 String data="ABCDEF";
		 byte arr3[]=data.getBytes(); // to be discussed in io-Stream; 
		 
		 for(byte b:arr3)
		 {
			 
			 System.out.println((char)b+" ");
			 
		 }
		 
		 
	}
	
	public static void main(String[] args)
	{
	  String09oct obj=new String09oct();
	 // obj.meth1();
	  obj.meth2();
	}
}
