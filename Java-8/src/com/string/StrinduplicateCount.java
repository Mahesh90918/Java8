package com.string;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrinduplicateCount {
	public static void main(String[] args) {
		String str = "hi mahesh welcome to to createIq";
		Map<String, Long> collect = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		System.out.println(collect);
		
		String string = Stream.of(str.split(" ")).reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println(string);
	}
}
