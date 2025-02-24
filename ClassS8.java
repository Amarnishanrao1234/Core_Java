package pack1;

public class ClassS8
{
	int c;
	static int e;
	public ClassS8()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args)
	{
		int a=34;
		int b=21;
		new ClassS8().c-=a++ + ++b;//a=35 b=22
		int d=--a + --b +new ClassS8().c--; //a=34 b=21 c=5
		System.out.println("d:"+d);
		e=a + +b +new ClassS8().c + d--;//c= 57 a
		System.out.println("e:"+e);
		int f=-a + b-- + -new ClassS8().c - d++;
		System.out.println("f:"+f);
		int sum=a+b+new ClassS8().c+d+e+f;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println(new ClassS8().c-=a++ + ++b);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("sum :"+sum);
		
	}
}
