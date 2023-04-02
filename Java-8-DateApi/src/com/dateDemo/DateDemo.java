package com.dateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate));

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.now();
		System.out.println(dtf1.format(localTime));

		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf2.format(now));

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
}
