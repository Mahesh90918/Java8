package com.vidvaan.utildate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DatebwTimeZones {
	static SimpleDateFormat FORMATTER = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mma z");

	public static void main(String[] args) {
		TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York"); // Target timezone

		Date currentDate = new Date();

		System.out.println(FORMATTER.format(currentDate)); // Date in current timezone

		FORMATTER.setTimeZone(etTimeZone);

		System.out.println(FORMATTER.format(currentDate)); // Date in target timezone
	}
}
