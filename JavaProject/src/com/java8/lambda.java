package com.java8;

public class lambda {
	public static void main(String[] args) {
//		Interface inte = () -> {
//			System.out.println("mahesh");
//		};
//		inte.mahesh();
//		Interface inte = (t) -> {
//
//			if (t < 10) {
//				return 0;
//			} else {
//				return 1;
//			}
//		};
//		System.out.println(inte.mahesh1(9));

		Interface inte = () -> {
			return "mahesh";
		};
		System.out.println(inte.mahesh2());
	}
}