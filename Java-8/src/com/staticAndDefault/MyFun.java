package com.staticAndDefault;

public interface MyFun {

	void sum(int a, int b);

	default void myfunDefault() {
		System.out.println("My fun myfunDefault");
	}

	static void myfunStatic() {
		System.out.println("My fun myfunStatic");
	}
	
	default void same() {
		System.out.println("My fun same");
	}
}
