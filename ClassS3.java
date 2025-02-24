package pack1;

public class ClassS3
{
	static int x=10;
	public static void main(String[] args)
	{
		ClassS3 t1 = new ClassS3();
		ClassS3 t2 = new ClassS3();
		
		t1.x =20;
		System.out.print(x+" ");
		System.out.println(t2.x);
		
	}
}
