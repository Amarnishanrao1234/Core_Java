package part_3_Java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Comparable_ClassA_25Nov 
{
	void meth1()
	 {
	    System.out.println("Implementing Sorting on Userdefined Class Objects");
	    
	    ArrayList<Employee>al=new ArrayList<Employee>();
	    al.add(new Employee("Amar", 68000, "Java"));
		al.add(new Employee("Sushant", 86800, "Spring"));
		al.add(new Employee("Gaurav", 100000, "AWS"));
	    
	    System.out.println("Before Sorting ");
	    Iterator<Employee>i1=al.iterator();
	    while (i1.hasNext())
	    {
	        System.out.println(i1.next());    
	    }

	    System.out.println("\n\n------------------------------------------------------");
	    Collections.sort(al);
	    System.out.println("After Sorting ");
	    Iterator<Employee>i2=al.iterator();
	    while (i2.hasNext())
	    {
	        System.out.println(i2.next());    
	    }

	 } 
	public static void main(String[] args)
	{
		new Comparable_ClassA_25Nov().meth1();
	}

}
