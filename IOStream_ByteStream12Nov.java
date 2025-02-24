package part_3_Java;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream_ByteStream12Nov 

 // Byte Stream
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading the data from a file");
		FileInputStream fis = new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR NISHANRAO.txt");
		System.out.println("Connection Created ");
		
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println("\n Data retrived");
		fis.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("Writing the data to a file ");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR.txt", true);
		System.out.println("Connection Created");
		
		String data="Java is Awesome";
		//byte arr[]=data.getBytes();
		//fos.write(arr);
		fos.write(data.getBytes());
		
		System.out.println("Data Entered");
		
		fos.close();
	}
	void fileOperation3()throws Exception
	{
		System.out.println("Copying the data into a file");
		FileInputStream fis = new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR NISHANRAO.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMAR.txt");
		System.out.println("Connection created ");
		
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Data copied");
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args)throws Exception
	{
		IOStream_ByteStream12Nov obj= new IOStream_ByteStream12Nov();
		//obj.fileOperations1();
		//obj.fileOperation2();
		obj.fileOperation3();
	}
	
}
