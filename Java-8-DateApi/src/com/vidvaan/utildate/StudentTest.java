package com.vidvaan.utildate;

import java.util.Date;


public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.setSid(1001);
		student.setSname("rohit");
		student.setSfee(20000.0);
		student.setCourseStartDate(new Date(2019, 7, 2));
		System.out.println("student Id :" + student.getSid());
		System.out.println("student Name:" + student.getSname());
		System.out.println("student fee :" + student.getSfee());
		// java util date with jdk 1
		System.out.println("student courseStartingDate :" + student.getCourseStartDate());
		student.studentHistory();
	}

}
