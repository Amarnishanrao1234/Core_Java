package part_3_Java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Collection_Vector_19Nov 
{
	void meth1()
	{
		System.out.println("************Implementing Vector************\n");
		Vector<Object>v= new Vector<Object>();
		v.add(10);
		v.add("java");
		v.add(null);
		v.add('A');
		v.add(true);
		v.add(10);
		v.add(1);
		v.add(99);
		
		System.out.println("\n"+v+" ");
		
		System.out.println("get() :"+v.get(1));
		System.out.println("size() :"+v.size());
		System.out.println("Capacity :"+v.capacity());
		
		v.add(1,1000);
		v.add(v.size()-2,500);
		v.add(999);
		
		System.out.println("\n"+v);
		System.out.println("size() :"+v.size());
		System.out.println("Capacity :"+v.capacity());
		
		System.out.println("\n ------Retrive data in forward direction by using for loop------");
		for(int i=0;i<=v.size()-1;i++)
		{
			
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n\n ------Retrive data in backward direction by using for loop------");
		for(int i=v.size()-1;i>=0;i--)
		{
			
			System.out.print(v.get(i)+" ");
		}
		System.out.println("\n\n------Retrive data in by using forEach loop------");
		for(Object o:v)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n\n ------Retrive data in  by using Enumeration Interface------");
		Enumeration<Object>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("\n\n ------Retrive data in  by using Iterator Interface------");
		Iterator<Object>i=v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println("\n\n******Passing all the data from Vector into ArrayList******");
		ArrayList<Object>al=new ArrayList<Object>(v);
		
		System.out.println("Vector :"+v);
		System.out.println("ArrayList :"+al);
		
		System.out.println("*****Passing Userdefine Class Object in to Vector******");
		Vector<Employee>v2=new Vector<Employee>();
		v2.add(new Employee("Raju", 101, "Hyd"));
		v2.add(new Employee("Ravi", 102, "Goa"));
		v2.add(new Employee("Ram", 103, "Pune"));
		
		Enumeration<Employee>e2=v2.elements();
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}
	}
	public static void main(String[] args)
	{
		Collection_Vector_19Nov obj= new Collection_Vector_19Nov();
		obj.meth1();
	}
}
