package part_3_Java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class IOStream_BufferedByteStream13Nov 
{
	void fileOperation1()throws Exception
	{
		System.out.println("Performing Buffered Byte Stream using Read the data of file");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR.txt") );
		System.out.println("Connection createted");
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\n succesful Read the data from file");
		bis.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("Performing Buffered Byte Stream using write the data into file");
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR1.txt",true));
		System.out.println("Connection createted");
		String msg=" Java is Awesome";
		bos.write(msg.getBytes());
		System.out.println("\n succesful Write data into file");
		bos.close();
	}
	void fileOperation3() throws Exception
	{
		System.out.println("Performing Buffered Byte Stream using  Copy the data into file");
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR1.txt")); 
		BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR3.txt"));
		System.out.println("Connection createted");
		int i;
		while((i=bis.read())!=-1)
		{
			bos.write(i);
		}
		System.out.println("\n succesful copied data to file");
		bis.close();
		bos.close();
	}
	public static void main(String[] args)throws Exception
	{
		IOStream_BufferedByteStream13Nov obj= new IOStream_BufferedByteStream13Nov();
		//obj.fileOperation1();
		//obj.fileOperation2();
		obj.fileOperation3();
	}
}
