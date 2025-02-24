package part_3_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting_25Nov
{
	void meth1()
	{
		System.out.println("***Meth1 called***");
		int arr[]= {10,50,30,20,40};
		System.out.println("----Before Array Sorting :"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("----After Array Sorting :"+Arrays.toString(arr));
		
		ArrayList<Integer>al= new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		
	    System.out.println("\n ----Before Arraylist Sorting :"+al);
	    //System.out.println("----After Arraylist Sorting :"+new TreeSet<Integer>(al));
	    Collections.sort(al);
	    System.out.println("----After Arraylist Sorting :"+al);
	    
	}
	public static void main(String[] args)
	{
		new Sorting_25Nov().meth1();
	}
}
