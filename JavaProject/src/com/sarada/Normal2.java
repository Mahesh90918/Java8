package com.sarada;

public class Normal2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
//		System.out.println((a == 10) & (b == 10));
//		System.out.println((a == 10) && (b == 10));
//		System.out.println((a == 11) & (b == 10));
//		System.out.println((a == 10) && (b == 10));
		
		// 1 0=1
		System.out.println((a == 11) | (b == 10));
		System.out.println((a == 11) || (b == 10));
		
		System.out.println(0==0 && 0==0);
	}
}
