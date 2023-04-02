package com.vidvaan.dateformater;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setSid(1001);
		student.setSname("sharma");
		student.setSfee(20000.00);
		String courDate="05-06-2019";
		SimpleDateFormat sdf=new SimpleDateFormat();
		Date date = null;
		try {
			date = sdf.parse(courDate);
		} catch (ParseException e) {
			System.out.println("please check the dateFormater");;
		}
		student.setCourseStartDate(date);
		System.out.println("student Id :" + student.getSid());
		System.out.println("student Name:" + student.getSname());
		System.out.println("student fee :" + student.getSfee());
		System.out.println("student courseStartingDate :" + student.getCourseStartDate());
		student.studentHistory();
	}

}
