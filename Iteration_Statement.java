package pack1;

public class Iteration_Statement 
{
	void meth1(int i)
	{
		System.out.println("-------meth1-------");
		while (i<=5)
		{
			System.out.println("i value : "+(i++));
		}
		System.out.println("meth1()execution Completed");
	}
	void meth2(int i)
	{
		System.out.println("-------meth2-------");
		while (i<=5)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("meth2()execution Completed");
	}
	void meth3(int i)
	{
		System.out.println("-------meth3-------");
		while (i<=10)
		{
			System.out.println(++i);
		}
		System.out.println("meth3()executed completed");
	}
	void meth4(int i)
	{
		System.out.println("-------meth4-------");
		while (i<=10)
		{
			System.out.println(i++ + ++i);
			i++;
		}
		System.out.println("meth4()executed completed");
	}
	void meth5(int i)
	{
		System.out.println("------meth5-------");
		while (i<=20)
		{
			System.out.println("i value  : "+(i++ + ++i));
			i++;
		}
		System.out.println("meth5()executed completed");
	}
	void meth6(int i)
	{
		System.out.println("------meth6-------");
		while (true)
		{
		System.out.println(i++);
		break;
		}
		System.out.println("meth6()executed complted");
	}
	void meth7(int i)
	{
		System.out.println("------meth7-------");
		do 
		{
			System.out.println("i value : "+(i++));
		} while (i<=5);
	}
	public static void main(String[] args)
	{
		Iteration_Statement obj=new Iteration_Statement();
		obj.meth1(1);
		obj.meth2(1);
		obj.meth3(1);
		obj.meth4(1);
		obj.meth5(1);
		obj.meth6(1);
		obj.meth7(1);
	}
}
