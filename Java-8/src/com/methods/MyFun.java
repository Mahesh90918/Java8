package com.methods;

public interface MyFun {
	
	void m();

	static void m1() {
		System.out.println("m1 static method MyFun  ");
	}

	 default void m2() {
		System.out.println("m2 default method MyFun  ");
	}
}
