package com.demo;

public class MyfunTestNormal {
	public static void main(String[] args) {

		MyFunctional myFunctional = new MyFunctional() {

			@Override
			public void printName() {
				System.out.println(" I am printName Method");

			}
		};
		myFunctional.printName();
	}
}
