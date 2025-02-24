package pack1;

public class Selection_Statement2
{
	void bill(int unit)
	{
		int bill=unit*100;
		if (bill>=100) 
		{
			int discount=(bill*10)/100;
			System.out.println("congratulation you recieve of "+discount+"Rs.as Discount");
			System.out.println("Your total Cost is :"+(bill-discount));
		}
		else
		{
			System.out.println("Your Final bill"+bill);
			System.out.println("Shop more"+(1000-bill)+"to recieve discount of 10%");
		}
	}
	public static void main(String[] args)
	{
		 new Selection_Statement2().bill(21);;
		 
	}
}
