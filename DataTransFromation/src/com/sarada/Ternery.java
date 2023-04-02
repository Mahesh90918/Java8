package com.sarada;

public class Ternery {
	public static void main(String[] args) {
		int a = 190;
		int b = 900;
		int c = 980;

		int res = a > b && a > c ? a : (b > c) ? b : c;
		System.out.println(res);
		
		if(a > b && a > c) {
			System.out.println(a);
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
