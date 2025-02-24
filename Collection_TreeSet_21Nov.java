package part_3_Java;

import java.util.Iterator;
import java.util.TreeSet;


public class Collection_TreeSet_21Nov
{
	void meth1()
	{
		System.out.println("***********Implementing TreeSet**********");
		TreeSet<Object>tSet=new TreeSet<Object>();
		tSet.add(10);//Insertion Ordered is Not Maintened (but Asending Order)
		tSet.add(33);//heterogenious data is not allowed 
		//tSet.add(null);//null is not allowed
		tSet.add(100);//Duplicate is not allowed
		tSet.add(510);//Available from java 1.2v
		tSet.add(30);//Default capacity is 16[load factor is 0.75]
		tSet.add(5);//size increase is double
		tSet.add(1150);// not syncronized
		
		System.out.println("TreeSet :"+tSet);
		System.out.println("Size TreeSet :"+tSet.size());
		
		System.out.println("\n headSet() :"+tSet.headSet(100));
		System.out.println("tailSet() :"+tSet.tailSet(100));
		
		System.out.println("\n\nRetrieving the data in Accending order by using foreach loop");
		for(Object o:tSet)
		{
			System.out.print(o+" ");
		}
		System.out.println("\n\nRetrieving the data in Decending  order by using iterator");
		Iterator<Object>i=tSet.descendingIterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		
	}
	public static void main(String[] args)
	{
		Collection_TreeSet_21Nov obj= new Collection_TreeSet_21Nov();
		obj.meth1();
		
		/*TreeSet<Employee>te=new TreeSet<Employee>();
		te.add(new Employee("AAAA", 10, "IIII"));
		te.add(new Employee("SSSS", 01, "OOOO"));
		te.add(new Employee("RRRR", 65, "PPPP"));
		Iterator<Employee>i2=te.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}*/
		
	}
}
