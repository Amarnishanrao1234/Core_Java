package part_3_Java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamsC14Nov
{
	void meth1()throws Exception
	{
		System.out.println("implementing Object Stream");
		
		ObjectStreamsA14Nov aobj1= new ObjectStreamsA14Nov();
		System.out.println(aobj1.a+" "+aobj1.b);
		
		ObjectStreamsB14Nov bobj1=new ObjectStreamsB14Nov();
		System.out.println(bobj1.x+" "+bobj1.y);
		
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\Object.ser"));
		System.out.println("Connection created");
		
		oos.writeObject(aobj1);
		oos.writeObject(bobj1);
		
		System.out.println("serilization Completed");
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:\\Users\\91937\\OneDrive\\Desktop\\Resume\\Object.ser"));
		System.out.println("Connection created");
		
		ObjectStreamsA14Nov aobj2= (ObjectStreamsA14Nov)ois.readObject();
		ObjectStreamsB14Nov bobj2= (ObjectStreamsB14Nov)ois.readObject();
		
		System.out.println(aobj2.a+" "+aobj2.b);
		System.out.println(bobj2.x+" "+bobj2.y);
		
		ois.close();
		oos.close();
		
		
	}
	public static void main(String[] args) throws Exception
	{
			ObjectStreamsC14Nov obj=new ObjectStreamsC14Nov();
			obj.meth1();
	}
}
