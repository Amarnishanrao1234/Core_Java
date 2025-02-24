package pack1;

public class Array07oct1 
{
	public boolean fristlast6(int[]nums)
	{
		if(nums[0]==6||nums[nums.length-1]==6)
		return true;
		return false;
	}
	public static void main(String[] args) 
	{
		new Array07oct1().fristlast6(null);
	}
}
