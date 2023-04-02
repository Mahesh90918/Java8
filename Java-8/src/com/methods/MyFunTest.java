package com.methods;

public class MyFunTest implements MyFun {

	@Override
	public void m() {
		System.out.println("Implemented method");
	}

	static void m1() {
		System.out.println("!!! Not Override static methods ");
		System.out.println(
				"Interface and implementing class , both can have static method with the same name without overriding each other.");
	}
       @Override
    public void m2() {
//    	// TODO Auto-generated method stub
//    	MyFun.super.m2();
    	   System.out.println("We can override the default method in implementing class");
    }
	public void normal() {
		System.out.println("Default methods are allowed only in interfaces.");
	}

	public static void main(String[] args) {
		MyFunTest m = new MyFunTest();
		m.m();
		m.m1();
		m.m2();
		m.normal();
		System.out.println("--------------");
		MyFun m1 = new MyFunTest();
		m1.m();
		MyFun.m1();
		m1.m2();

		System.out.println("--------------");
		MyFun m11 = new MyFun() {

			@Override
			public void m() {
				System.out.println("fghjkl");
			}
		};
		m11.m();
		MyFun.m1();
		m11.m2();
	}

}
