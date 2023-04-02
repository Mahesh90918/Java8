package com.vidvaan.utilcalender;

import java.util.Calendar;
import java.util.Locale;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar=Calendar.getInstance(Locale.CHINA);
		System.out.println(calendar.getTime());
	}

}
