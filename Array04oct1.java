package pack1;

import java.util.Arrays;

public class Array04oct1
{
	boolean[]meth1(int num[],String name[])
	{
		//task1:print element of num arry in reversed order 
		System.out.println("Task 1");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]+" ");
		}
		//task2:print all element of names array
		System.out.println("task 2");
		for(String data:name)
		{
			System.out.println(data+" ");
		}
		
		return new boolean[] {true,false,true};
	}
	public static void main(String[] args)
	{
		Array04oct1 aobj=new Array04oct1();
		
	/*	int input1[]= { 11,22,33};
				
		String input2[]= {"Kishan","Bharat","Annu"};
		boolean result []=aobj.meth1(input1, input2); */
		
		boolean result []=aobj.meth1(new int[] {11,22,33},new String[] {"Amar","Gaurav","java"});
		System.out.println("Task 3");
		System.out.println(Arrays.toString(result));
				
		
	}
}
