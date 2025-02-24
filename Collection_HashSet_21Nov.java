package part_3_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Collection_HashSet_21Nov 
{
	void meth1()
	{
		System.out.println("*********Implementing Set Interface*********");
		
		HashSet<Object>set=new HashSet<Object>();
		set.add(10);//insertion order is not maintained[java 1.2v]
		set.add("Java");//heterogenious data is all
		set.add(null);
		set.add(10);
		set.add('A');
		set.add(1); //default capacity is 16 [load factor is 0.75]
		set.add(false);
		set.add(99);// is not synchronized
		
		System.out.println(set+"\n");
		System.out.println("Size of HashSet :"+set.size());
		System.out.println("\nRetrieve the Userdefine from using Iterator  ");
		Iterator<Object>i=set.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n\nRetrieve the data from using ListIterator  in reverse order ");
		LinkedList<Object>ll= new LinkedList<Object>(set);
		ListIterator<Object>li=ll.listIterator(ll.size());
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		ArrayList<Boolean>al= new ArrayList<Boolean>();
		al.add(true);
		al.add(true);
		al.add(true);
		al.add(true);
		al.add(true);
		HashSet<Boolean>set2=new HashSet<Boolean>(al);
		
		System.out.println("\n al :"+" "+al.size());
		System.out.println("set2 :"+" "+set2.size());
		
		
		
		//HashSet<Employee>set3=new HashSet<Employee>();
		
	}
	
	
	public static void main(String[] args)
	{
		Collection_HashSet_21Nov obj= new Collection_HashSet_21Nov();
		obj.meth1();
		HashSet<Employee>set3=new HashSet<Employee>();
		set3.add(new Employee("A", 01, "M"));
		set3.add(new Employee("B", 02, "N"));
		set3.add(new Employee("C", 03, "O"));
		
		Iterator<Employee>i2=set3.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
}
