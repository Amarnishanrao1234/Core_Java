package pack1;

import java.util.Iterator;

public class Array03oct3 
{
	void meth1()
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0;i<3;i++)
		{
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		}
	}
	void meth2()
	{
		String arr1[][]= {{"*"," "," "},{"*","*"," "},{"*","*","*"}};
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.print(arr1[i][j]+" ");
				}
				System.out.println();
		}
	}
	void meth3()
	{
		String arr1[][]= {{"*"," "," "},{"*","*"," "},{"*","*","*"}};
		for(int i=0;i<3;i--)
		{
				for(int j=0;j<3;j--)
				{
					System.out.print(arr1[i][j]+" ");
				}
				System.out.println();
		}
	}
	public static void main(String[] args)
	{
		
		//new Array03oct3().meth1();
		//new Array03oct3().meth2();
		new Array03oct3().meth3();
	}
}
