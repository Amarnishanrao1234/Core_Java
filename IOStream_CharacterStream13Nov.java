package part_3_Java;

import java.io.FileReader;
import java.io.FileWriter;

public class IOStream_CharacterStream13Nov 
{
	void fileOperation1()throws Exception
	{
		System.out.println("Read data from the file ");
		
		FileReader fr= new FileReader("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR.txt");
		System.out.println("connection created");
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("Write a data in file");
		FileWriter fw = new FileWriter("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR1.txt",true);
		
		String data;
		data="hi Amar";
		fw.write(data);
		
		
		System.out.println("write successfully");
		fw.close();
		
	}
	void fileOperation3()throws Exception
	{
		System.out.println(" copying data to another file");
		FileReader tr= new FileReader("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR1.txt");
		FileWriter fw = new FileWriter("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR2.txt");
		
		int i;
		while((i=tr.read())!=-1)
		{
			fw.write(i);
		}
	   tr.close();
	   fw.close();
	   System.out.println("copying successfuly ");
	}
	public static void main(String[] args)throws Exception
	{
	 IOStream_CharacterStream13Nov obj= new IOStream_CharacterStream13Nov();
	 //obj.fileOperation1();
	 //obj.fileOperation2();
	 obj.fileOperation3();
	}
	
}
