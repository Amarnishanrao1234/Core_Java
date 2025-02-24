package part_3_Java;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Collection_Priority_Queue
{
	void meth1()
	{
		System.out.println("********Implementing Priority Queue*******");
		
		PriorityQueue<Object>pq=new PriorityQueue<Object>();
		
		pq.add(68);// insertion order is not maintainted but PriorityQueue always showing 1st element is smallest. 
		pq.add(20);//heterogenious data is not allowed 
		//pq.add(null);//null value is not allowed
		pq.add(2);//Duplicate data is allowed 
		pq.add(65);//is is available from from java 1.5v
		pq.add(68);//default capacity is 11
		pq.add(104);//size is increase by double
		pq.add(108);//not synchronized
		
		System.out.println(pq);
		
		System.out.println("\nPoll() : "+pq.poll());
		System.out.println(pq);
		
		System.out.println("remove() :"+pq.remove());
		
		//pq.clear();
		//System.out.println("\nPoll() : "+pq.poll());-----> Print Null
		//System.out.println("remove() :"+pq.remove());----> Exception
		
		System.out.println(pq);
		System.out.println("\n\n----------Retriving Data using iterator----------");
		Iterator<Object>i=pq.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}
	public static void main(String[] args)
	{
		Collection_Priority_Queue obj= new Collection_Priority_Queue();
		obj.meth1();
	}
}
