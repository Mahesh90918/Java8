package com.vidvaan.utilcalender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderMethodEx2 extends GregorianCalendar {
	public static void main(String[] args) {

		// create a new calender
		// Calendar cal = Calendar.getInstance();
		CalenderMethodEx2 cal = new CalenderMethodEx2();
		// print the current date
		System.out.println("the current date is:" + cal.getTime());
		// clear the calender
		cal.clear();
		// set a new year and call complete()
		cal.set(GregorianCalendar.YEAR, 1986);
		// protect method
		cal.complete();
		System.out.println("New Date is :" + cal.getTime());
	}

}
