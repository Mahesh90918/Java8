package com.predefinedFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, String> fun = str -> str.toUpperCase();
		System.out.println(fun.apply("Mahesh"));
		Function<String, Integer> fun1 = str -> str.length();
		System.out.println(fun1.apply("Mahesh"));

		BiFunction<String, String, String> bi = (t1, t2) -> t1 + " " + t2;
		System.out.println(bi.apply("unukuru", "mahesh"));
		BiFunction<String, String, Integer> bi1 = (t1, t2) -> t1.length() + t2.length();
		System.out.println(bi1.apply("unukuru", "mahesh"));

		System.out.println("-------------Method Reference---------------");

		Function<String, Integer> fun2 = String::length;
		System.out.println(fun2.apply("Mahesh"));

		BiFunction<String, String, String> bi2 = String::concat;
		System.out.println(bi2.apply("unukuru", "mahesh"));

		BiFunction<String, String, Integer> bi3 = FunctionDemo::methodd;
		System.out.println(bi3.apply("unukuru", "mahesh12345"));
		
	}

	public static Integer methodd(String s1, String s2) {
		return s1.length() + s2.length();

	}
}
