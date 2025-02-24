package pack1;

import java.util.Arrays;

public class Array04oct2
{
	int[]meth1()
	{
		int arr[]= {6,3,2};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==2 && arr[i+1]==3)
			{
				arr[i+1]=0;
			}
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		Array04oct2 obj= new Array04oct2();
		int result[]=obj.meth1();
		System.out.println(Arrays.toString(result));
	}
}
