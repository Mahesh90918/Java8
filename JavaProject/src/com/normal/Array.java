package com.normal;

public class Array {
	public static void main(String[] args) {
		int[] a = new int['a'];// (valid)
		byte b = 10;
		int[] a1 = new int[b];// (valid)
		short s = 20;
		int[] a2 = new int[s];// (valid)
//		int[] a3 = new int[10l];// C.E:possible loss of precision//(invalid)
//		int[] a_4 = new int[10.5];// C.E:possible loss of precision//(invalid)
		// int[] a5 = new int[-3];// R.E:NegativeArraySizeException
//	System.out.println(a5);

		// int[] a10=new int[2147483647];//(valid)
		// int[] a20=new int[2147483648];
		// C.E:integer number too large: 2147483648(invalid)

		int[][] a123 = new int[6][3];
		System.out.println(a123.length);// 6
		System.out.println(a123[0].length);// 3


	}
}
