package part_3_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class Maps_HashMap_22Nov
{
	void meth1()
	{
		System.out.println("**********Implementing Map Interface*********");
		HashMap<Object, Object>map= new HashMap<Object, Object>();// Insertion Order is not maintentaied
		
		map.put(101, "Java");//insertion order is not mainteined
		map.put(102, "Python");//allowed heterogenious key ,heterogenious value; 
		map.put(null, null);//null value is allowed
		map.put(105, "Java");// Duplicate value is allowed 
		map.put(106, 'A');//load factor is 0.75
		map.put(107, false);//it default capacity is 16
		map.put(108, 6485);//size is increase by default 
		map.put(109, "Oracle");//not synchronized
		
		System.out.println(map);
		
		System.out.println("\n get(106) :"+map.get(106));
		System.out.println("\n get(109) :"+map.get(109));
		map.put(109, "Spring");
		System.out.println("\n get(109) :"+map.get(109));
		
		System.out.println("\n\n---------Retriving the data from map---------");
		HashSet<Object>hs=new HashSet<Object>(map.keySet());
		System.out.println("All the keys"+hs+"\n");
		for(Object o:hs)
		{
			System.out.println(o+" "+map.get(o));
		}
		
		System.out.println("-----Retriving the data using Entry Interfaec------");
		ArrayList<Object>al=new ArrayList<Object>(map.entrySet());
		Iterator<Object>i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			//Entry e=(Entry)i.next();
			//System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args)
	{
		Maps_HashMap_22Nov obj= new Maps_HashMap_22Nov();
		obj.meth1();
	}
}
