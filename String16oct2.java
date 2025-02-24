package pack1;

public class String16oct2 
{
	void meth1()
	{
		int iterations=100000;
		String data="a";
		
		Long startTime=System.currentTimeMillis();
		String str="";
		
		for(int i=0;i<iterations;i++)
		{
			str+=data;
		}
		
		Long endTime = System.currentTimeMillis();
		long StringDuration=endTime-startTime;
		
		startTime=System.currentTimeMillis();
		StringBuffer stringBuffer =new StringBuffer();
		
		for(int i=0;i<iterations;i++)
		{
			stringBuffer.append(data);
		}
		
		endTime=System.currentTimeMillis();
		Long StringbufferDuration=endTime-startTime;
		
		startTime=System.currentTimeMillis();
		StringBuilder stringBuilder=new StringBuilder();
		
		for(int i=0;i<iterations;i++)
		{
			stringBuilder.append(data);
			
		}
		
		endTime=System.currentTimeMillis();
		Long StringBuilderDuration=endTime-startTime;
		
		System.out.println("Time taken for String concutenation : "+StringDuration+"ms");
		System.out.println("Time taken for StringBuffer concutenation : "+StringbufferDuration+"ms");
		System.out.println("Time taken for StringBuilder concutenation : "+StringBuilderDuration+"ms");
		
		
	}
	public static void main(String[] args)
	{
		new String16oct2().meth1();
	}
}
