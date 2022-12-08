package com.imp;

public class sarada1 {
	static void mahesh() {
		System.out.println("static method");
	}

	void mahesh1() {
		System.out.println("Normal method 1");
	}

	public static void main(String[] args) {
		sarada1 s = new sarada1();
		s.mahesh();
		s.mahesh1();
		sarada1 s1 = null;
		s1.mahesh();
//		s1.mahesh1();//java.lang.NullPointerException
	}
}
