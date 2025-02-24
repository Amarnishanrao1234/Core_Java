package part_3_Java;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream14Nov
{
	void fileOperation() throws Exception
	{
		System.out.println("implementing Data Stream ");
		DataOutputStream dos= new DataOutputStream(new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMARN1.txt"));
		System.out.println("Connection Created");
		
		dos.writeInt(1000);
		dos.writeBoolean(false);
		dos.writeChar('A');
		
		
		System.out.println("data Entered Securely ");
		dos.close();
		System.out.println("----------------------------------------------------");
		DataInputStream dis= new DataInputStream(new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\AMARN1.txt"));
		System.out.println("Connection Created");
		
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		
		
		System.out.println("Data retrived ");
		dis.close();
		
	}
	public static void main(String[] args)throws Exception
	{
		DataStream14Nov obj= new DataStream14Nov();
		obj.fileOperation();
	}
}
