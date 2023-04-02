package com.vidvaan.utilcalender;

import java.time.LocalDate;
import java.util.Scanner;

public class FindingDay {

	public static String getDay(String day, String month, String year) {
		int d = Integer.parseInt(day);
		int m = Integer.parseInt(month);
		int y = Integer.parseInt(year);
		LocalDate lt = LocalDate.of(y, m, d);
		return lt.getDayOfWeek().name();
	}

	public static void main(String[] args) {
		System.out.println("enter day, month and year......");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		String month = scanner.next();
		String year = scanner.next();
		System.out.println(getDay(day, month, year));
	}
}
