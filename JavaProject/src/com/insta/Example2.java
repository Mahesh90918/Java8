package com.insta;

public class Example2 {
	public static void main(String[] args) {
		System.out.println(quiz(2, 3));
	}

	private static int quiz(int x, int y) {
		if (y == 1) {
			return x;
		}
		return x + quiz(x, y - 1);
	}
}
