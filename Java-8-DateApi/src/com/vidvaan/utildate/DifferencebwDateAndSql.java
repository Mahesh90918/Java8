package com.vidvaan.utildate;

import java.sql.Timestamp;
import java.util.Date;

public class DifferencebwDateAndSql {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("returns current date with time and zone:" + date);
		// System.out.println(" getting Hours:" + date.getHours());
		// System.out.println(" getting Minutes :" + date.getMinutes());

		java.sql.Date sqlDate = new java.sql.Date(0);
		System.out.println("returns default date only : " + sqlDate);
		// if we try to get time of sql date it throws IllegalArgumentException
		// System.out.println("try to get hours :" + sqlDate.getHours());
		// System.out.println("try to get minutes :" + sqlDate.getMinutes());
		java.sql.Date sqlCurrentDate = new java.sql.Date(System.currentTimeMillis());
		System.out.println("returns current date only : " + sqlCurrentDate);
		
		//converting sqldate to date
		java.sql.Date sqlDateToDate = new java.sql.Date(date.getTime());
		System.out.println("returns default date only : " + sqlDateToDate);
		
		//converting sqldate with sql timestamp
		long time=date.getTime();
		Timestamp timestamp= new Timestamp(time);
		System.out.println("returns  date and time : " + timestamp);
		
		//convert sqldate to date
		Date dateSql=timestamp;
		dateSql=sqlCurrentDate;
		System.out.println(dateSql);
		System.out.println(sqlCurrentDate);
		

	}

}
