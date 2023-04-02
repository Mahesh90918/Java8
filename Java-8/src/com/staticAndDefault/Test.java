package com.staticAndDefault;

public class Test implements MyFun, Myfun2 {

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub

	}

//	 Ambiguity problem from default methods
//	 in both interfaces have a same method name
	@Override
	public void same() {
		MyFun.super.same();
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.myfunDefault();
		t.same();
	}

}
