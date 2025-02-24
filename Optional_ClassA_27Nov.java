package part_3_Java;

import java.util.Arrays;
import java.util.Optional;

public class Optional_ClassA_27Nov 
{
	void meth1()
	{
		String arr[]=new String [5];
		
		arr[1]="Kishan";
		arr[2]="Java";
		
		//System.out.println(Arrays.deepToString(arr));
		//System.out.println(arr[3].toUpperCase());
		
	/*	Optional<String>o= Optional.ofNullable(arr[1]);
		System.out.println(o);
		if(o.isPresent())
		{
			System.out.println("Data is present");
			System.out.println(o.get());
		}
		else
		{
			System.out.println("It is Empty");
		}
	*/
		for(String s:arr)
		{
			Optional<String>o2=Optional.ofNullable(s);
			if(o2.isPresent())
			{
				System.out.println(o2.get().toUpperCase());
			}
			else
			{
				System.out.println("-----------------");
			}
		}
	}
	public static void main(String[] args)
	{
		new Optional_ClassA_27Nov().meth1();
	}
}
