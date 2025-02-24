package part_3_Java;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_LinkedList_20Nov2
{
	//*****************Time********************
	
	private static Object arr[];
	
	static
	{
		arr= new Object [100000]; 
		
		for(int i=0;i<arr.length;i++)//Using for loop to print 100000
		{
			arr[i]=new Object();
		}
		
	}
	void ArraylistTime()
	{
		long start;
		long end;
		ArrayList<Object>al=new ArrayList<Object>();
		start= System.currentTimeMillis();
		for(Object obj1:arr)
		{
			al.add(obj1);
			
		}
		end=System.currentTimeMillis();
		System.out.println("Arraylist Construction time "+(end-start));
	}
	void LinkedlistTime()
	{
		long start,end;
		LinkedList<Object>ll=  new LinkedList<Object>();
		start=System.currentTimeMillis();
		for(Object obj2:arr)
		{
			ll.add(obj2);
		}
		end=System.currentTimeMillis();
		System.out.println("Linkedlist Construction time "+(end-start));
	}
	void meth1()
	{
		for(Object o:arr)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args)
	{
		Collection_LinkedList_20Nov2 obj= new Collection_LinkedList_20Nov2();
		obj.ArraylistTime();
		obj.LinkedlistTime();
		//obj.meth1();
	}
}
