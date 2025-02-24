package part_3_Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOStream_BufferedCharaterStream13Nov 
{
	void fileOperation1() throws Exception
	{
		System.out.println("Performing Buffered_Character_Stream using Read the data of file");
		BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR.txt"));
		System.out.println("Connection created");
		int i;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println("Data read succesfully ");
		br.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("Performing Buffered_Character_Stream using Write the data of file");
		BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR1.txt",true));
		System.out.println("Connection created");
		
		String data= "hellow buddy";
		bw.write(data);
		
		System.out.println("Data write succesfully ");
		bw.close();
	
	}
	void fileOperation3()throws Exception
	{
		System.out.println("Performing Buffered_Character_Stream using Copy the data of file");
		BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR.txt"));
		BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR1.txt",true));
		System.out.println("Connection Created"); 
		
		int i;
		while((i=br.read())!=-1)
		{
			bw.write(i);
		}
		System.out.println("Data coppied succesfully");
		br.close();
		bw.close();
	}
	public static void main(String[] args)throws Exception
	{
		IOStream_BufferedCharaterStream13Nov obj= new IOStream_BufferedCharaterStream13Nov();
		//obj.fileOperation1();
		//obj.fileOperation2();
		obj.fileOperation3();
	}

}
