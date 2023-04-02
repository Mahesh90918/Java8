package com.insta;

public class Example1 {

	public static void main(String[] args) {
		System.out.println(fun(3,3));
	}

	private static int fun(int x, int y) {
		// TODO Auto-generated method stub
		if (x == 0) {
			return y;
		}
		return fun(x - 1, x + y);
	}
}
