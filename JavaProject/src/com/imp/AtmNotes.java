package com.imp;

public class AtmNotes {
	
	public static void main(String[] args) {
		int money = 2987;
		int n500, n200, n100, n50, n10, n5, n1 = 0;
		if (money >= 500) {
			n500 = money / 500;
			System.out.println("Number of 500 Notes :" + n500);
			money = money % 500;
		}
		if (money >= 100) {
			n100 = money / 100;
			System.out.println("Number of 100 Notes :" + n100);
			money = money % 100;
		}
		if (money >= 50) {
			n50 = money / 50;
			System.out.println("Number of 50 Notes  :" + n50);
			money = money % 50;
		}
		if (money >= 10) {
			n10 = money / 10;
			System.out.println("Number of 10 Notes  :" + n10);
			money = money % 10;
		}
		if (money >= 5) {
			n5 = money / 5;
			System.out.println("Number of 5 Notes   :" + n5);
			money = money % 5;
		}
		if (money >= 1) {
			n1 = money / 1;
			System.out.println("Number of 1 Notes   :" + n1);
		}
	}
}
