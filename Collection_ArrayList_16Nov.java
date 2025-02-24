package part_3_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_ArrayList_16Nov
{
	void meth1()
	{
		System.out.println("***********Implementing ArrayList********** \n");
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		
		al.add(10);   //Insertion Order in maintained 
		al.add(33);   //Hetrogeneous data is allowed
		al.add(null); //Null value is allowed
		al.add(10);  //Duplicates are allowed
		al.add(25);  //It is available from java 1.2v
		al.add(99);  //Its default capacity is 10.
		al.add(76);	 // It is Size increses by Half( current capacity*3/2)+1
		al.add(44);  // Is is not synchronozed by default
		
		System.out.println(al+"  ");
		System.out.println("Size() :"+al.size());
		System.out.println("get() :"+al.get(0));
		System.out.println("get() :"+al.get(al.size()-1)+"\n");
		
		System.out.println("*******Retrieve data by using For Loop*******");
		System.out.println("forward Direction ");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println("\n"+"Backward Direction ");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println("\n*******Retrieve data by using ForEach Loop*******");
		for (Object element : al) // for(interger element:al) OR for(int element:al)
		{
			System.out.print(element+" ");
		}
		
		System.out.println("\n*******Retrieve data by using Iteration Interface*******");
		Iterator<Integer>i= al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		System.out.println("----------------------------------");
		System.out.println("*********Methods**********");
		System.out.println("isEmpty() :"+al.isEmpty());
		//al.clear();
		//System.out.println("isEmpty() :"+al.isEmpty());
		System.out.println("contains()"+al.contains(25));
		ArrayList<Integer>al2=new ArrayList<Integer>();
		al2.add(99);
		al2.add(10);
		System.out.println("containsAll()"+al.containsAll(al2));
		System.out.println("Before Size :"+al.size());
		System.out.println(al);
		System.out.println("AllAdd :"+al.addAll(2,al2));
		System.out.println("Before Size :"+al.size());
		System.out.println(al);
		System.out.println("remove() :"+al.remove((Object)1000));// remove the element basing value
		System.out.println(al);
		System.out.println("remove() :"+al.remove(1));// remove the element basing value
		System.out.println(al);
		System.out.println("retainAll()"+al.removeAll(al2));
		System.out.println(al);
	}
	public static void main(String[] args)
	{
		Collection_ArrayList_16Nov obj= new Collection_ArrayList_16Nov();
		obj.meth1();
	}
}
