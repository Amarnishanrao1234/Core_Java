package part_3_Java;

import java.util.ArrayList;
import java.util.Iterator;


public class Collection_ArrayList_18Nov_Employee2 
{
	void meth1()
	{
		System.out.println("Passing Userdefined Class Object into ArrayList");
		ArrayList<Collection_ArrayList_18Nov_Employee>al= new ArrayList<Collection_ArrayList_18Nov_Employee>();
		Collection_ArrayList_18Nov_Employee emp1=new Collection_ArrayList_18Nov_Employee("Allen",50000,"Java");
		Collection_ArrayList_18Nov_Employee emp2=new Collection_ArrayList_18Nov_Employee("Smith",55000,"python");
		Collection_ArrayList_18Nov_Employee emp3=new Collection_ArrayList_18Nov_Employee("Adam",50000,"AWS");
		
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(new Collection_ArrayList_18Nov_Employee("jone",6500,"AI"));
		
		System.out.println("ArrayList :"+al);
		
		Iterator<Collection_ArrayList_18Nov_Employee>i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	public static void main(String[] args)
	{
		new Collection_ArrayList_18Nov_Employee2().meth1();
	}
}
