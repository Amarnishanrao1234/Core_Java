package part_3_Java;

public class ClassB implements Cloneable
{
	int a=111;
	int b=222;
	int c=100;
	public ClassB CreateClone()throws CloneNotSupportedException
	{
		ClassB bobj=(ClassB)super.clone();
		return bobj;
		
	}
}
