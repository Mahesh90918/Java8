package com.vidvaan.dateformater;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	private int sid;
	private String sname;
	private double sfee;
	private Date courseStartDate;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double sfee, Date courseStartDate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.courseStartDate = courseStartDate;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public void studentHistory() {

		String stdJoinDate = "2019-06-01";
		SimpleDateFormat sdf = new SimpleDateFormat(stdJoinDate);
		try {
			sdf.parse(stdJoinDate);
		} catch (ParseException e) {
			System.out.println("please check the date format");
			;
		}
		Date courseEndDate = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("E dd-MM-yyyy");
		String str = sdf2.format(courseEndDate);
		System.out.println("student joining date from :" + stdJoinDate);
		System.out.println("course Ending date from :" + str);

	}

}
