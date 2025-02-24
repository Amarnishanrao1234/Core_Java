package part_3_Java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class New_Date_Time_Class 
{
	void meth1()
	{
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	 
	
	}
	public static void main(String[] args)
	{
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(ZoneId.of("Australia/Melbourne"));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss");
		String ampm=LocalTime.now().format(dtf);
		System.out.println("===>"+ampm);
		//new New_Date_Time_Class().meth1();
	}
}
