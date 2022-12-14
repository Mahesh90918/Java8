package com.functionalInt;

import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Times"));
		System.out.println(f.apply("Soft"));
	}
}
