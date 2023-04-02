package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
	public static void main(String[] args) {
		Integer[] i = { 12, 21, 323, 343, 121, 12, 45, 343 };
		List<Integer> order = Arrays.stream(i).sorted().collect(Collectors.toList());
		System.out.println(order);
		List<Integer> order1 = Stream.of(i).sorted().collect(Collectors.toList());
		System.out.println(order1);
		List<Integer> order2 = Stream.of(i).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(order2);
		Integer order3 = Stream.of(i).sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(order3);
		Integer order4 = Stream.of(i).sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(order4);
		Integer order41 = Stream.of(i).sorted().distinct().skip(1).findFirst().get();
		System.out.println(order41);
	}
}
