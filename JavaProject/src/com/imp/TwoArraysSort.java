package com.imp;

import java.util.Arrays;

public class TwoArraysSort {

	public static void main(String[] args) {
		int a[] = { 1, 8, 3, 9, 5, 6 };
		int b[] = { 7, 2, 4, 0 };
		int a1 = a.length;
		int b1 = b.length;
		int arr[] = new int[a1 + b1];
		for (int i = 0; i < a1; i++) {
			arr[i] = a[i];
			for (int j = 0; j < b1; j++) {
				arr[a1 + j] = b[j];

			}
		}
//		Arrays.sort(c);
//		System.out.println(Arrays.toString(c));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.print(arr[i] + " ");
		}
	}
}