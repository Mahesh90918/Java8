package com.methoArbitraryObject;

import java.util.function.BiFunction;

public class TestAribitary {
	public static void main(String[] args) {
		System.out.println("----------Empolyee argument-----");
		Empolyee emp = new Empolyee();
		BiFunction<Empolyee, String, String> arb = (em, a) -> em.msg(a);
		System.out.println(arb.apply(emp, "mahesh"));
		BiFunction<Empolyee, String, String> bi =Empolyee::msg; 
		System.out.println(bi.apply(emp, "mahesh"));
		System.out.println("----------Empolyee argument-----");
		BiFunction<Empolyee, String, String> arg = (em, a) -> em.eng(a);
		System.out.println(arg.apply(new Empolyee(), "MAHESH"));
		BiFunction<Empolyee, String, String> ar = Empolyee::eng;
		System.out.println(ar.apply(new Empolyee(), "MAHESH"));
		
	}
}
