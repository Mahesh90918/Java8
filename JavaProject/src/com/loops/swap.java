package com.loops;

public class swap {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
//		int temp;
//		temp = x;
//		x = y;
//		y = temp;

		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x + " " + y);
	}
}
