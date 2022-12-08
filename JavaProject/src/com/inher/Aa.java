package com.inher;

public class Aa {
	static int mahesh(int s) {
		return s;
	}

	int mahesh1(int s) {
		return s;
	}

	public static void main(String[] args) {
		String s2="mahesh";
		String s = new String("mahesh").intern();
		String s1 = new String("mahesh");
		StringBuffer str = new StringBuffer("mahesh");
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
}
