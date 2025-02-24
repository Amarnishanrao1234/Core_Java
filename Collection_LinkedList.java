package part_3_Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Collection_LinkedList 
{
	void meth1()
	{
		System.out.println("********Implementing LinkedList**********\n");
		LinkedList<Object>ll=new LinkedList<Object>();
		ll.add(10);
		ll.add("java");
		ll.add(null);
		ll.add(10);
		ll.add('A');
		ll.add(false);
		ll.add(1);
		ll.add(99);
		
		System.out.println(ll);
		System.out.println("\n-----------Retriving the data foreach-----------");
		for(Object o:ll)
		{
			System.out.print(o+" ");
		}
		
		System.out.println("\n\n-----------retriving using List iterator----------");
		System.out.println("Forward -->");
		ListIterator<Object>li= ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("\nReverse-->");
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("\n\n-----------------------------------------------------");
		System.out.println("\n---Arraylist---: "+new ArrayList<Object>(ll));
		System.out.println("\n---vector---: " +new Vector<Object>(ll));
	}
	void meth2(LinkedList<Employee>empll)
	{
		for(Object o :empll)
		{
			System.out.println(o+" ");
		}
	}
	public static void main(String[] args)
	{ 
		Employee e1=new Employee("Nibba", 510, "hyd");
		Employee e2=new Employee("Dhiraj P", 420, "Pune");
		Employee e3=new Employee("lodo", 511, "mumbai");
		
		LinkedList<Employee>ll2=new LinkedList<Employee>();
		ll2.add(e1);
		ll2.add(e2);
		ll2.add(e3);
		
		Collection_LinkedList obj= new Collection_LinkedList();
		obj.meth1();
		obj.meth2(ll2);
		
	}
}
