package com.insta;

public class Example {
	public static void main(String[] args) {
		System.out.println(fun(5));
	}

	private static int fun(int n) {
		int res;
		if (n == 1) {
			return 1;
		}
		res = fun(n - 1);
		return res;
	}
}
