package com.imp;

public class Aaa {
	private String function() {
		return ("WithOut Parameter");

	}

	public final static String function(int data) {
		return ("With parameter");

	}

	public static void main(String[] args) {
		Aaa a = new Aaa();
		System.out.println(a.function());
	}
}
