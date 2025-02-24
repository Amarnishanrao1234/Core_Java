package part_3_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Collection_LinkedHashSet_21Nov 
{
	void meth1()
	{
		System.out.println("********Implementing LinkedHashSet***********");
		
		LinkedHashSet<Object>lSet= new LinkedHashSet<Object>();
		
		lSet.add(10);//insertion order is not maintained[java 1.2v]
		lSet.add("Java");//heterogenious data is all
		lSet.add(null);
		lSet.add(10);
		lSet.add('A');
		lSet.add(1); //default capacity is 16 [load factor is 0.75]
		lSet.add(false);
		lSet.add(99);// is not synchronized
		
		System.out.println("LinkeHashSet :"+lSet);
		
		System.out.println("Retrieving data from Iterator ");
		Iterator<Object>i= lSet.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n\nRetrieve the data from using ListIterator  in reverse order ");
		ArrayList<Object>al= new ArrayList<Object>(lSet);
		ListIterator<Object>li=al.listIterator(al.size());
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("\nRetrieve the Userdefine from using Iterator  ");
		Iterator<Object>i3=lSet.iterator();
		while(i3.hasNext())
		{
			System.out.print(i3.next()+" ");
		}
	}
	public static void main(String[] args)
	{
		Collection_LinkedHashSet_21Nov obj=new Collection_LinkedHashSet_21Nov();
		obj.meth1();
		
		LinkedHashSet<Employee>lhs=new LinkedHashSet<Employee>();
		lhs.add(new Employee("HHH", 56, "KKK"));
		lhs.add(new Employee("KKK", 58, "MMM"));
		lhs.add(new Employee("MMM", 59, "HHH"));
		Iterator<Employee>it=lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
