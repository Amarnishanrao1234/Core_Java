package part_3_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_ArrayList_18Nov_Student2 
{
	 ArrayList<Student>meth1(ArrayList<String>al1,boolean arr[],ArrayList<Integer>al2)
     {
        System.out.println("-----------Task 1--------------");
        for(int i=al1.size()-1;i>=0;i--)
        {
            System.out.println(al1.get(i)+" ");
        }

        System.out.println("-----------Task 2---------------");
        for(boolean flag:arr)
        {
            System.out.println(flag+" ");
        }

        System.out.println("------------Task 3--------------");
        ArrayList<Integer>al3=new ArrayList<Integer>();
        for(int i=al2.size()-1;i>=0;i--)
        {
            al3.add(al2.get(i));
        }
        System.out.println("al3 "+ al3);

        ArrayList<Student>al4=new ArrayList<Student>();
        al4.add(new Student("bard", "Java", 98));
        al4.add(new Student("Allen", ".Net", 100));
        al4.add(new Student("Ross", "Python", 89));


        return al4;
     }  
	 public static void main(String[] args)
	 {
		 Collection_ArrayList_18Nov_Student2 obj= new Collection_ArrayList_18Nov_Student2();
		 ArrayList<String>input1=new ArrayList<String>();
         input1.add("String");
         input1.add("Oracle");
         input1.add("Spring");
         
         boolean input2[]={true,false,true};
         ArrayList<Integer>input3=new ArrayList<Integer>();
         input3.add(1000);
         input3.add(2000);
         input3.add(3000);

         ArrayList<Student>result=obj.meth1(input1, input2, input3);

         System.out.println("-------------Task 4-------------");
         Iterator<Student>i=result.iterator();
         while(i.hasNext())
         {
            System.out.println(i.next());
         }
         
	 }
}
