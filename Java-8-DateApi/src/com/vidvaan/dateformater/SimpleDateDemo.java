package com.vidvaan.dateformater;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = formater.format(date);
		System.out.println("Date to String :" + strDate);
		formater = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		strDate = formater.format(date);
		System.out.println("Date format with dsmy :" + strDate);
		formater = new SimpleDateFormat("E dd MMMM yyyy zzzz hh:mm:ss");
		strDate = formater.format(date);
		System.out.println(strDate);
		System.out.println();
		formater = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		strDate = formater.format(date);
		System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate);

	}

}
