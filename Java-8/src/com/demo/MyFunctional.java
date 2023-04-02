package com.demo;

@FunctionalInterface
public interface MyFunctional {

	public void printName();

	default void printName1() {
		System.out.println("I am default method");
	}

	static void printName2() {
		System.out.println("I am static method");
	}
}
