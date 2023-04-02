package com.vidvaan.utilcalender;

import java.util.GregorianCalendar;

public class GregorianExample {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("timezone  :" + gc.getTimeZone());
		System.out.println("Year :" + gc.get(gc.YEAR));
		System.out.println("Month :" + gc.get(gc.MONTH));
		System.out.println("weekOfDay :" + gc.get(gc.DAY_OF_WEEK));
		System.out.println("DayOfweek in month :" + gc.get(gc.DAY_OF_WEEK_IN_MONTH));
		System.out.println("WeekOfYear :" + gc.get(gc.WEEK_OF_YEAR));
		System.out.println("WeekOfMonth :" + gc.get(gc.WEEK_OF_MONTH));
		System.out.println("hour fo day :" + gc.get(gc.HOUR_OF_DAY));
		System.out.println("hour :" + gc.get(gc.HOUR));
		// clone method
		System.out.println("original Date :" + gc.getTime());
		System.out.println("clone date and time :" + gc.getTime().clone());

	}

}
