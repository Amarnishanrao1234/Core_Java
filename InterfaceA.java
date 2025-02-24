package opps_concept;

public interface InterfaceA
{
	public static final int a=10;// variable are always default define as (PUBLIC , STATIC,FINAL)
	
	public abstract void meth1();// methods are always default define as (PUBLIC , ABSTRACT)
	
	void msg();
	
	default void meth2()
	{
		System.out.println("Interface A default methods");
		this.meth4();
	}
	static void meth3()
	{
		System.out.println("Interface A Static  methods");
	}
	private void meth4()
	{
		System.out.println("Interface A Private methods");
	}
	public static void main(String[] args)
	{
		System.out.println("Interface main() methods");
		InterfaceA.meth3();
	}
	
}
