package com.loops;

public class forlopp {
	public static void main(String[] args) {
		int row = 3;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(row+" ");
				row=row+3;
			}
			System.out.println();
		}
	}
}
