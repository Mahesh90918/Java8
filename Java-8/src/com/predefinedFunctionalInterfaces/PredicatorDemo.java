package com.predefinedFunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicatorDemo {
	public static void main(String[] args) {
		Predicate<Integer> pre = (t) -> t % 2 == 0;
		System.out.println(pre.test(10));
		System.out.println(pre.test(11));
		BiPredicate<Integer, Integer> bi=(t,r)->t==r;
		System.out.println(bi.test(12, 12));
		System.out.println(bi.test(12, 121));
		
		BiPredicate<Integer, Integer> bi1=(t1,t2)->t1>t2;
		System.out.println(bi1.test(12, 10));
		System.out.println(bi1.test(10, 12));
	}
}
