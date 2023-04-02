package com.vidvaan.utilcalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaCalenderExample {
	public void dateExample() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
		String date = dateFormat.format(new Date());
		System.out.println(date);

		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "15-08-2015 09:15:36";
		// System.out.println(dateInString);
		Date date2;
		try {
			date2 = dateFormat2.parse(dateInString);
			System.out.println("Indian 72 independence day :" + date2);
		} catch (ParseException e) {
			System.out.println("please parse correct date format");
		}

	}

	public void calenderExample() {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		// System.out.println(sdf.format(calendar.getTime()));
		System.out.println(calendar.getTime());
		System.out.println("year :" + calendar.get(calendar.YEAR));
		System.out.println("Month :" + calendar.get(calendar.MONTH));
		System.out.println("dayOfMonth :" + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("dayOfWeek :" + calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("WeekOfYear :" + calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("WeekOfMonth :" + calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println(calendar.get(calendar.HOUR));
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(calendar.MINUTE));
		System.out.println(calendar.get(calendar.SECOND));
		System.out.println(calendar.get(calendar.MILLISECOND));
	}

	public void calenderExampleWithCustom() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		System.out.println(sdf.format(calendar.getTime()));
	}

	public void calenderExampleWithGregorian() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2015, 0, 31, 11, 70, 11);
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println("year :" + calendar.get(calendar.YEAR));
		System.out.println("Month :" + calendar.get(calendar.MONTH));
		System.out.println("dayOfMonth :" + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("dayOfWeek :" + calendar.get(calendar.DAY_OF_WEEK));
		System.out.println("WeekOfYear :" + calendar.get(calendar.WEEK_OF_YEAR));
		System.out.println("WeekOfMonth :" + calendar.get(calendar.WEEK_OF_MONTH));
		System.out.println(calendar.get(calendar.HOUR));
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(calendar.MINUTE));
		System.out.println(calendar.get(calendar.SECOND));
		System.out.println(calendar.get(calendar.MILLISECOND));
	}

	public void dateManipulate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MMM,dd");
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.MONTH, 1);
		System.out.println("Date :" + sdf.format(calendar.getTime()));

		calendar.add(calendar.DAY_OF_MONTH, -30);
		System.out.println("Date :" + sdf.format(calendar.getTime()));

	}

	public static void main(String[] args) {
		JavaCalenderExample jce = new JavaCalenderExample();
		// jce.dateExample();
		// jce.calenderExample();
		// jce.calenderExampleWithCustom();
		// jce.calenderExampleWithGregorian();
		jce.dateManipulate();

	}

}
