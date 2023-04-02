package com.vidvaan.utilcalender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapYearExample {

	public static boolean isLeapYear(int year) {
		// 1583 is the first year of the gregorian calender
		//assert year >= ;
		year=2020;
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

	}

	public static void main(String[] args) {
		// 1. calender
		Calendar calendar = Calendar.getInstance();
		System.out.println(isLeapYear(calendar.get(calendar.YEAR)));

		// 2.Date
		Date date = new Date();
		System.out.println(isLeapYear(date.getYear()));

		// 3. Gregorian calender
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(isLeapYear(gc.get(gc.YEAR)));
	}

}
