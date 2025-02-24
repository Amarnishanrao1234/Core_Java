package pack1;

public class Class25sept
{
	void meth1()
	{
		System.out.println("--meth1()Called--");
		int arr[]= {10,20,30,40,50};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("\n Using for loop to retrive the data from arry");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("\n using for loop to retrive the data in reverse order");
		
		for(int i=4;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Using for_each_loop to retrive the data from arry");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args)
	{
		new Class25sept().meth1();
	}
}
