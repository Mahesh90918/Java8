package com.vidvaan.utildate;

import java.sql.Date;
import java.time.LocalDate;

public class SqlDateMethods {
	//
	public static void main(String[] args) {
		long mills = System.currentTimeMillis();
		Date sqlDate = new Date(mills);
		System.out.println("sql date :" + sqlDate);
		System.out.println("converting sqldate to local date :" + sqlDate.toLocalDate());
		sqlDate.setTime(1000);
		System.out.println("to string :" + sqlDate.toString());
		// java.util.Date date=new java.util.Date();
		LocalDate localDate = LocalDate.now();
		System.out.println("valueOf local date :" + sqlDate.valueOf(localDate));
		String str = "2019-8-15";
		System.out.println("converting string to sql date :" + sqlDate.valueOf(str));

	}

}
