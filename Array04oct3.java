package pack1;

public class Array04oct3 
{
	int meth(int[]arr)
	{
		
		if(arr.length>=2)
			return arr[0]+arr[1];
		else if(arr.length==1)
			return arr[0];
		else 
			return 0;
	}
	public static void main(String[] args)
	{
		Array04oct3 obj =new Array04oct3();
		int result=obj.meth(new int[] {8,2,1,4});
		System.out.println(result);
	}
}
