package com.predefinedFunctionalInterfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Function_UnaryOper {

	public static void main(String[] args) {

		Function<String, String> ex =String::toLowerCase;
		System.out.println(ex.apply("UNUKURU"));
		Function<String, Integer> ex1 =String::length;
		System.out.println(ex1.apply("abcd"));
		System.out.println("-----------------------");
//		UnaryOperator<T> extends Function<T, T> 
		UnaryOperator<String> un=String::toUpperCase;
		System.out.println(un.apply("unukuru"));
		UnaryOperator<String> un1=String::toLowerCase;
		System.out.println(un1.apply("UNUKURU"));
		
	}

}
