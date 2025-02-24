package part_3_Java;
import java.util.Arrays;

public class Parallel_Array_Sorting_ClassA 
{
	void meth1()
	{
		int arr[]= {1,4,2,7,3,9,8,6,5};
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		
		Arrays.parallelSort(arr,1,4);
		Arrays.parallelSort(arr,5,8);
		System.out.println("After Sorting:"+Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		new Parallel_Array_Sorting_ClassA().meth1();
	}
}
