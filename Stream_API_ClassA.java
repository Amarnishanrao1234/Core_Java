package part_3_Java;

import java.util.ArrayList;

public class Stream_API_ClassA 
{
	void meth1()
	{
		System.out.println("*******Implementing Stream API*******");
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(50);
		System.out.println(al);
		
		al.forEach(data->System.out.println(data));
	}
	public static void main(String[] args)
	{
		new Stream_API_ClassA().meth1();
	}
}
