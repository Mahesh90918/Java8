package com.vidvaan.utildate;

import java.time.Instant;
import java.util.Date;

public class DateMethods {

	// in java date represents in two ways...1.Date() constructor
	// 2. Date (long mills) it returns epoch time to present time in milliseconds

	public static void main(String[] args) {

		Date date = new Date();
		// System.out.println("returns current date :" + date);

		Date date2 = new Date(System.currentTimeMillis());
		// System.out.println("returns current date :" + date2);
		// and
		long milliseconds = System.currentTimeMillis();
		 System.out.println("returns since 1 jan 1970 to till date in milliseconds :" + milliseconds);

		 Date date4=new Date(0, 0, 0);
		 System.out.println("date four: "+date4);
		// date methods
		System.out.println("original date :" + date);
		System.out.println("cloned date :" + date.clone());
		// test if the current date is before the given date
		Date date3 = new Date(2018, 8, 15);
		System.out.println("before method :" + date.before(date3));
		System.out.println("after method :" + date3.after(date));
		// or
		// DateMethods dateMethods = new DateMethods();
		// dateMethods.dateBeforeAndAfter();

		// compare to methods
		System.out.println("compareTo method :" + date.compareTo(date3));
		// equals to methods
		System.out.println("equals method :" + date.equals(date3));

		// static date instant to methods
		System.out.println("instant method :" + Date.from(Instant.now()));

		// getTime()
		System.out.println("getTime method :" + date.getTime());

		// hashCode
		System.out.println("hashCode method :" + date.hashCode());

		// setTime() and toString method()
		date.setTime(1000);
		System.out.println("toString  method :" + date.toString());

		// (instant of instant) returns an instant representing the same point on
		// time-line as the date object.
		System.out.println("instant of instant  method :" + date.toInstant());

		System.out.println("date in string format :" + date.toString());

	}

	public void dateBeforeAndAfter() {
		Date date = new Date();
		Date date3 = new Date(2018, 8, 15);
		if (date3.after(date) && date.before(date3)) {
			System.out.println("date 3 after and before dates are  true :");
		} else {
			System.out.println("the given dates are not correct :");
		}
	}

}
