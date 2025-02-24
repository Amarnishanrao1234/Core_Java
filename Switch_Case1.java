package pack1;

public class Switch_Case1 
{
	void meth1(char operator,int num1,int num2)
	{
		switch (operator)
		{
		case '+':
		{
			System.out.println("Addition : "+(num1+num2));
			break;
		}
		case '-':
		{
			System.out.println("Substraction : "+(num1-num2));
			break;
		}
		case '*':
		{
			System.out.println("Multiplication : "+(num1*num2));
			break;
		}
		case '/':
		{	
			System.out.println("Divide : "+(num1/num2));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}
	public static void main(String[] args) 
	{
		new Switch_Case1().meth1('-', 100, 20);
	}
}
