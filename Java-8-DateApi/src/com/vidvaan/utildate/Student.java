package com.vidvaan.utildate;

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

	public Student(int sid, String sname, double sfee, Date joinDate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.courseStartDate = joinDate;
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

	public void setCourseStartDate(Date joinDate) {
		this.courseStartDate = joinDate;
	}

	public void studentHistory() {
		Date joinDate = new Date(2018, 7, 15);
		Date courseEndDate = new Date(2019, 4, 30);
		System.out.println("student joining date from :" + joinDate);
		System.out.println("course Ending date from :" + courseEndDate);

	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", joinDate=" + courseStartDate + "]";
	}

}
