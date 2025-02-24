package part_3_Java;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_23Nov
{
	void meth1()
	{
		System.out.println("******Implementing TreeMap******** ");
		
		TreeMap<Object, Object>tmap=new TreeMap<Object, Object>();
		
		tmap.put(108, "Java");//Insertion Order is not maintainted but sorting key order in maintented
		tmap.put(105, 1560);//Heterogemious key is mot allowed, but value is allowed.
		tmap.put(103, null);// Key is not Allowed but value is null allowed.
		tmap.put(101, "Java");//Duplicate are allowed.
		tmap.put(102, 'D');//it is available from java 1.2v
		tmap.put(106, 955);// its default capacity is 16. 
		tmap.put(104, 646);// its Size increase by double
		tmap.put(107, 547);// Not Synchnronized
		
		System.out.println(tmap+"\n\n");
		LinkedHashSet<Object>lhs=new LinkedHashSet<Object>(tmap.entrySet());
		Iterator<Object>i=lhs.iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	public static void main(String[] args)
	{
		TreeMap_23Nov obj= new TreeMap_23Nov();
		obj.meth1();
	}
}
