package part_3_Java;

import java.util.ArrayList;
import java.util.HashMap;

public class Task_Lambda_ClassA 
{
	void display() 
	{
		System.out.println("---Implementing Lambda Expression---");
		Task_Lambda_InterfaceA x=(li)->
		{
			li.add(100);
			li.add(200);
			
			System.out.println("ArrayList :"+li);
			HashMap<Object, Object>hm =new HashMap<Object, Object>();
			hm.put(100, "Java");
			hm.put(102, "Oracle");
			
			return hm;
		};
		ArrayList<Integer>al1=new ArrayList<Integer>();
		al1.add(110);
		al1.add(120);
		HashMap<Object, Object>result=x.meth1(al1);
		System.out.println("result :"+result);
		
	
	}
	public static void main(String[] args)
	{
		new Task_Lambda_ClassA().display();
	}
}
