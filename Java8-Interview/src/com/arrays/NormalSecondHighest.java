package com.arrays;

public class NormalSecondHighest {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 32, 43, 23, 12, 45 };
		int largeNumber = 0;
		int secondNumber = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largeNumber) {
				secondNumber = largeNumber;
				largeNumber = arr[i];
			} else if (arr[i] > secondNumber && arr[i] !=largeNumber) {
				secondNumber = arr[i];
			}
		}
		System.out.println(largeNumber);
		System.out.println(secondNumber);
	}
}
