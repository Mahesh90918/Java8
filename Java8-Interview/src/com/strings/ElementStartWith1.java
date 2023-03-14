package com.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartWith1 {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 11, 15, 65, 10 };
		System.out.println("---Integer to String-----");
		List<String> collect = Arrays.stream(arr).boxed().map(s -> s + "").collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("---ElementStartWith1-----");
		List<String> collect2 = Arrays.stream(arr).boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("---Reverse order ElementStartWith1-----");
		List<String> collec = Arrays.stream(arr).boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collec);
	}
}
