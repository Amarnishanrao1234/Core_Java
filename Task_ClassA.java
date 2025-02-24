package part_3_Java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
public class Task_ClassA 
{
	void displayA()
	{
		Task_InterfaceA x =(m,li)->
		{
			System.out.println("Value m :"+m);
			System.out.println("Value li :"+li);
		
		};
		ArrayList<Object>al= new ArrayList<Object>();
		al.add(100);
		al.add(200);
		x.meth1(500, al);
	}
	void displayB()
	{
		Task_InterfaceB y =(k, n, l)->
		{
			System.out.println("Value k:"+k);
			System.out.println("Value n:"+n);
			System.out.println("Value l:"+l);
			return "Java";
		};
		int i= 20;
		String j="Java is Awesome";
		char p= 'A';
		y.meth2(i, j, p);
		
	}
	void displayC()
	{
		Task_InterfaceC z=(int y,ClassB b)->
		{
			System.out.println("Value :"+y);
			System.out.println("Value :"+b);
		};
		int b=500;
		ClassB a;
		//z.meth3(b, a);
	}
	void displayD()
	{
		Task_InterfaceD u=(hmap,al2)->
		{
			System.out.println("Value hmap :"+hmap);
			System.out.println("Vlaue al2 :"+al2);
			hmap.put(1121, "AMAR");
			hmap.put(1122, "Kishan");
		};
		HashMap<Object, Object>map1=new HashMap<Object, Object>();
		map1.put("Kishan", "Java");
		map1.put("Sudhakar", "Oracle");
		ArrayList<Object>al3=new ArrayList<Object>();
		al3.add(111);
		al3.add(2220);
		u.meth4(map1, al3);
	}
	void displayE()
	{
		Task_InterfaceE e=(int arr1[],TreeSet<Object>ts1)->
		{
			System.out.println("Value :"+arr1);
			System.out.println("Value :"+ts1);
			int arr[]= {10,20,30};
			ts1.add(10);
			ts1.add(20);
			ts1.add(30);
			int arr2[]= {100,200,300};
			return arr2;
		};
		int arr3[]= {111,222,333};
		TreeSet<Object>ts3=new TreeSet<Object>();
		ts3.add(11);
		ts3.add(22);
		ts3.add(33);
		e.meth5(arr3, ts3);
	}
	public static void main(String[] args)
	{
		Task_ClassA obj=new Task_ClassA();
		//obj.displayA();
		//obj.displayB();
		//obj.displayC();
		//obj.displayD();
		obj.displayE();
	}
}
