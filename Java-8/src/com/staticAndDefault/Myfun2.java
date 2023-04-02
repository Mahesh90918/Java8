package com.staticAndDefault;

public interface Myfun2 {
	void sub(int a, int b);

	default void myfun2Default() {
		System.out.println("My fun2 myfunDefault");
	}

	static void myfun2Static() {
		System.out.println("My fun2 myfunStatic");
	}
	default void same() {
		System.out.println(" My fun2 same ");
	}
}
