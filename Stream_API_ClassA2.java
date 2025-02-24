package part_3_Java;

import java.util.ArrayList;
//import java.util.stream.Stream;

public class Stream_API_ClassA2 
{
 void meth1()
 {
	 System.out.println("*******Implementing Stream API*******");
	 
	 ArrayList<String>al= new ArrayList<String>();
	 al.add("Amar");
	 al.add("Gaurav");
	 al.add("Suaraj");
	 al.add("Akshay");
	 al.add("vansh");
	 al.add("Sushant");
	 al.add("Piush");
	 al.add("Samrat");
	 al.add("Sushant");
	 al.add("Pranav");
	 al.add("Soham");
	 
	 al.forEach(data->System.out.println(data));
	 
	 /*Stream<String>s1=al.stream();
	 Stream<String>s2=s1.filter(data->data.length()<=5);
	 long l=s2.count();*/
	 
	 //long l=al.stream().filter(data->data.length()<=5).count();
	 
	 System.out.println("There are "+al.stream().filter(data->data.length()<=5).count()+"  Object whose lenght<=6");
	 
 }
 public static void main(String[] args)
 {
	 new Stream_API_ClassA2().meth1();
 }
}
