package com.StringExample;

public class TwoStrAdd {

	public static void main(String[] args) {
		String s = "ram20 sita30";
		String regex = "[^\\d]+";
		String[] str = s.split(regex);
		String add = "";
		int in = 0;
		for (int i = 1; i < str.length; i++) {
			in = in + Integer.parseInt(str[i]);
		}
		System.out.println(in);
	}
}
