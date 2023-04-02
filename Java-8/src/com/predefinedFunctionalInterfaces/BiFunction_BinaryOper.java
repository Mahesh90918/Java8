package com.predefinedFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunction_BinaryOper {
	public static void main(String[] args) {
		BiFunction<String, String, String> bi = (t1, t2) -> t1 + " " + t2;
		System.out.println(bi.apply("unukuru", "mahesh"));
		BiFunction<String, String, Integer> bi1 = (t1, t2) -> t1.length() + t2.length();
		System.out.println(bi1.apply("unukuru", "mahesh"));
		System.out.println("---------------------");
		BiFunction<String, String, String> ex =String::concat;
		System.out.println(ex.apply("unukuru", "mahesh"));
		BiFunction<Integer, Integer, Integer> ex1 =Integer::sum;
		System.out.println(ex1.apply(10,20));
		System.out.println("-----------------------------");
//		BinaryOperator<T> extends BiFunction<T,T,T>
		BinaryOperator<String> str=String::concat;
		System.out.println(str.apply("unukuru", "mahesh"));
		BinaryOperator<Integer> in=Integer::sum;
		System.out.println(in.apply(2345,234));
		
	}
}
