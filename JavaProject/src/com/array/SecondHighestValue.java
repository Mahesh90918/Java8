package com.array;

import java.util.Arrays;

public class SecondHighestValue {
	public static int getSecondLargest(int[] a) {
		int total = a.length;
		Arrays.sort(a);
		int second = 0;
		for (int i = total - 2; i >= 0; i--) {
			if (a[i] != a[total - 1]) {
				second = a[i];
				return second;
			}
		}
		return second;

	}

	public static void main(String[] args) {
		int[] a = { 10, 64, 30, 43, 60, 98, 98 };
		System.out.println(getSecondLargest(a));
	}
}
