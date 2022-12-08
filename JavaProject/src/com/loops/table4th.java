package com.loops;

public class table4th {
	public static void main(String[] args) {
		int num = 4;
		int a = 4;
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num + a;
			}
			num= --a;
			System.out.println();

		}
	}
}
