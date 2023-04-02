package com.vidvaan.utilcalender;

import java.util.Calendar;
import java.util.Date;

public class CalenderMethods {
	
	
	//Calendar cal=Calendar.getInstance();
	
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date=new Date();
		date=calendar.getTime();
		System.out.println("returns current date and time :" + calendar.getTime());
		System.out.println("timezone  :" + calendar.getTimeZone());
		System.out.println("Year :" + calendar.get(calendar.YEAR));
		System.out.println("Month :" + calendar.get(calendar.MONTH));
		System.out.println("weekOfDay :" + calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("DayOfweek in month :" + calendar.get(calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("WeekOfYear :" + calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("WeekOfMonth :" + calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println("hour fo day :" + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("hour :" + calendar.get(calendar.HOUR));
		//clone method
		System.out.println("original Date :" + calendar.getTime());
		System.out.println("clone date and time :" + calendar.getTime().clone());
		System.out.println("date :"+date);
		
		
		
		

	}

}
