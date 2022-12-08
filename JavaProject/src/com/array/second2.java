package com.array;

public class second2 {
	public static int secondArray(int[] a) {

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}System.out.print(a[i]+" ");
		}
		System.out.println();
		return a[a.length - 2];

	}

	public static void main(String[] args) {
		int[] b = { 3, 4, 5, 7, 5, 3, 2, 9 };
   System.out.println(secondArray(b));
	}
}
