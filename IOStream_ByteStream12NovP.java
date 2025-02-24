package part_3_Java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOStream_ByteStream12NovP 
{
	void Customerfile() throws Exception
	{
		System.out.println("customer file data ");
		FileInputStream msg= new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\D1.txt");
		
		System.out.println("ready to read customer data");
		
		int i;
		while((i=msg.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("the data of customer above");
		msg.close();
	}
	void unother_user()throws Exception
	{
		FileOutputStream wr= new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\D1.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter below: ");
		
		
		wr.write(sc.next().getBytes());
		
		System.out.println("successfuly updation execute ");
		wr.close();
		sc.close();
	}
	void copydata()throws Exception
	{
		FileInputStream in= new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\thor.jpg");
		FileOutputStream op= new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\thor.jpg");
		
		int i;
		while((i=in.read())!=-1)
		{
			op.write(i);
		}
		System.out.println("Data copied");
		in.close();
		op.close();
	}
	public static void main(String[] args)throws Exception
	{
		IOStream_ByteStream12NovP obj= new IOStream_ByteStream12NovP();
		//obj.Customerfile();
		//obj.unother_user();
		obj.copydata();
	}
}
