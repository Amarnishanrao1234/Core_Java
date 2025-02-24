package pack1;
import java.util.Arrays;
public class Arry02oct 
{
	void meth1()
	{
		System.out.println("meth1()called");
		
		int arr1[];
		arr1=new int[5];
		
		int arr2[]=new int[3];
		
		int arr3[]= {10,20,30,40,50};
		
		int arr4[]=new int [] {11,22,33,44,55,66};
		
		String s="Java is Awesome";
		
		System.out.println("arr1.length :"+arr1.length);
		System.out.println("arr1.length :"+arr1.length);
		System.out.println("arr1.length :"+arr1.length);
		System.out.println("arr1.length :"+arr1.length);
		System.out.println("s length :"+s.length()+"\n");
		
		
		System.out.println("arr1 :"+arr1);
		System.out.println("arr2 :"+arr2);
		System.out.println("arr3 :"+arr3);
		System.out.println("arr4 :"+arr4+"\n");
		
		System.out.println("arr1 :"+Arrays.toString(arr1));
		System.out.println("arr2 :"+Arrays.toString(arr2));
		System.out.println("arr3 :"+Arrays.toString(arr3));
		System.out.println("arr4 :"+Arrays.toString(arr4)+"\n");
		
		arr1[1]=15;
		arr1[3]=45;
		arr2[arr2.length-2]=99;
		
		System.out.println("arr1 :"+Arrays.toString(arr1));
		System.out.println("arr2 :"+Arrays.toString(arr2));
		System.out.println("arr3 :"+Arrays.toString(arr3));
		System.out.println("arr4 :"+Arrays.toString(arr4)+"\n");
		
		System.out.println(arr1[arr2.length+1]);
		System.out.println(arr4[arr4.length/2]);
		System.out.println(arr2[arr2.length-1]);
		System.out.println(arr3[arr3.length-2]);
		System.out.println(arr4[(arr1.length-arr2.length)+1]);
		
	}
	public static void main(String[] args)
	{
		new Arry02oct().meth1();
	}
}
