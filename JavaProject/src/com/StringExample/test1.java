package com.StringExample;

public class test1 {
	public static void main(String[] args) {
		String s = "wersdASDFGtfg!@#$%^1234";
		String r1 = "", r2 = "", r3 = "", r4 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				r1 = r1 + ch;
			} else if (ch >= 'A' && ch <= 'Z') {
				r2 = r2 + ch;
			} else if (ch >= '0' && ch <= '9') {
				r3 = r3 + ch;
			} else {
				r4 = r4 + ch;
			}
		}

		System.out.print(r1 + r2 + r3 + r4);
		
		System.out.println("mahesh"+10+20);//mahesh1020
		System.out.println(20+30+"mahesh"+10+20);//50 mahesh 1020
		System.out.println(20+30+"mahesh".concat("10").concat("20"));
		System.out.println(20+30+"mahesh"+(10+20));// 50 mahesh 30
		System.out.println(20+30+"mahesh");//50mahesh
	}
}
