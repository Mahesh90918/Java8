package com.vidvaan.utilcalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalCulatingDaysBetweenTwoDays {
	public long daysBetween(Date one, Date two) {
		long difference = (one.getTime() - two.getTime()) / 8640000;
		return Math.abs(difference);
	}

	public static void main(String[] args) {
		Date today = new Date();
		// as per java date documentation
		// gettime method of date is depricated. thats why here cal obj is came
		Calendar myNextCal = Calendar.getInstance();
		myNextCal.set(2020, 0, 1);
		Date nyd = myNextCal.getTime();

		CalCulatingDaysBetweenTwoDays cal = new CalCulatingDaysBetweenTwoDays();
		long days = cal.daysBetween(today, nyd);

		SimpleDateFormat sdf = new SimpleDateFormat("MMMM, dd, yyyy");
		String todaysDate = sdf.format(today);
		String newyearDay = sdf.format(nyd);

		System.out.println(days + " days from todays date of " + todaysDate + " until " + newyearDay);

	}

}
