package pack1;

public class ForLoop 
{
	void meth1()
	{
		System.out.println("------meth1()-----");
		for (int i=1;i<=5;++i) 
		{
			System.out.println("i value : "+i);
		}
		System.out.println("meth1() execution complete");
	}
	void meth2() 
	{
		System.out.println("------meth2()-----");
		for(int i=1;i<=10;i++)
		{
			System.out.println("i value : "+i);
			i++;
		}
		System.out.println("meth2() exectuion complete");
	}
	void meth3()
	{
		System.out.println("------meth3()------");
		int i=1;
		for(;i<=5;)
		{
			System.out.println("i value : "+i++ +" "+ ++i);
		}
		System.out.println("meth3()executed complete");
	}
	void meth4()
	{
		System.out.println("------meth4()------");
		int i=1,j=5;
		for(;i<=5;i++,j++)
		{
			for(;j>0;j--)
			{
				System.out.println("==>"+i++ +" "+j);
			}
		}
		System.out.println("i value : "+i);
		System.out.println("j value : "+j);
		System.out.println("meth4() executed complete");
	}
	void meth5()
	{
		System.out.println("------meth5()------");
		int i=1;
		for(System.out.println("-----meth5()"),System.out.println("------");i<=5;)
		{
			System.out.println("i value : "+i++);
		}
		System.out.println("meth5() executed complete");
	}
	int meth6()
	{
		System.out.println("------meth6()------");
		return 'A';
	}
	void meth7()
	{
		System.out.println("------meth7()-------");
		
	}
	void meth8()
	{
		System.out.println("------meth8()--------");
		for(int i=new ForLoop().meth6();i<=5;new ForLoop().meth7())
		{
			System.out.println("i value : "+i);
		}
		System.out.println("meth8()executed complete");
	}
	void meth9() 
	{
		System.out.println("------meth9()-------");
		int i=10;
		for(;;)
		{
			System.out.println("i value : "+ i++);
			break;
		}
		System.out.println("meth9()executed complete");
	}
	void meth10()
	{
		System.out.println("------meth10()------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("meth10()executed compelete");
	}
	void meth11()
	{
		System.out.println("------meth11()------");
		for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		System.out.println("meth11()executed com");
	}
	public static void main(String[] args)
	{
		ForLoop obj=new ForLoop();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		obj.meth5();
		obj.meth6();
		obj.meth7();
		obj.meth8();
		obj.meth9();
		obj.meth10();
		obj.meth11();
	}
}
