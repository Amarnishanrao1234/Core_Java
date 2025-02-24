package pack1;


public class Task15oct3 
{
	//~~~~~~~~~~Palendrom or rivers String~~~~~~~~~~~~~~\
	
	void checkName(String name)
	{
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		System.out.println("name : "+name);
		System.out.println("rev : "+rev);
		
		if(name.equalsIgnoreCase(rev))
			System.out.println(name+"is a palendrom ");
		else 
			System.out.println(name+"is not a palendrom ");
	
	}
	public static void main(String[] args) 
	{
		Task15oct3 obj = new Task15oct3();
		obj.checkName("Nitin");
	}
}
