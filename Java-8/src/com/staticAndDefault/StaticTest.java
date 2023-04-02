package com.staticAndDefault;

public class StaticTest {
	public static void main(String[] args) {

		MyFun sta = (a, b) -> System.out.println("sum :" + (a + b));
		Myfun2 sta1 = (a, b) -> System.out.println("sub :" + (a - b));
		sta.sum(10, 20);
		sta1.sub(20, 10);
		System.out.println("--------------static method--------");
		MyFun.myfunStatic();
		
		System.out.println("--------------default method--------");
		sta.myfunDefault();
		sta1.same();
		sta.same();
	}
}
