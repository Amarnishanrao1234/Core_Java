package part_3_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API_ClassA3 
{
	void meth1()
	{
		System.out.println("*******Implementing Stream API*******");
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(60);
		al.add(90);
		al.add(50);
		al.add(70);
		al.add(80);
		al.add(100);
		System.out.println(al);
		
		Stream<Integer>s=al.stream().map(data->data*2);
		List<Integer>li=s.collect(Collectors.toList());
		System.out.println(li);
	}
	public static void main(String[] args)
	{
		new Stream_API_ClassA3().meth1();
	}
}
