package com.normal;

public class Exception {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException("jdafssjgdf");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Airthmatic");
		}
		System.out.println("outtt");
	}
}
