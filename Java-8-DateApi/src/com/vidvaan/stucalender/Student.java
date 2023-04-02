package com.vidvaan.stucalender;

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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", courseStartDate=" + courseStartDate
				+ "]";
	}
	


}
