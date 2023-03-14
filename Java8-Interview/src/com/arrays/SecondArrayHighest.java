package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondArrayHighest {
	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 6, 9, 4, 2 };
		System.out.println("-------forword order-------");
		List<Integer> order = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
		System.out.println(order);
		System.out.println("-------reverserOrder order---------");
		List<Integer> reverserOrder = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverserOrder);
		System.out.println("-------skip first Number order---------");
		List<Integer> skipFirst = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).skip(1).collect(Collectors.toList());
		System.out.println(skipFirst);
		System.out.println("-------second highest---------");
		Integer second = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(second);
		
		System.out.println("========Count elements============");
		Long lo = Arrays.stream(a).count();
		System.out.println(lo);
	}
}
