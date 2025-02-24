package part_3_Java;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTable_23nov 
{
	void meth1()
	{
		System.out.println("******Implementing HashTable*********");
		
		Hashtable<Object, Object>ht= new Hashtable<Object, Object>();
		
		ht.put(108, "Java");//Insertion Order is not maintainted.
		ht.put("Java", 1560);//Heterogemious key is allowed, but value is allowed.
		ht.put(103, "Java");// Key is not Allowed but value is not null allowed.
		ht.put(101, "Java");//Duplicate are allowed.
		ht.put(102, 'D');//it is available from java 1.2v[Legacy Class]
		ht.put(106, 955);// its default capacity is 11. 
		ht.put(104, 646);// its Size increase by double
		ht.put(107, 547);// It is Synchnronized
		
		System.out.println(ht);
		Iterator<Object>i=new ArrayList<Object>(ht.keySet()).iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o+" "+ht.get(o));
		}
	}
	public static void main(String[] args)
	{
		new HashTable_23nov().meth1();
	}
}
