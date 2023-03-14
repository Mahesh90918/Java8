package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDupCount {
	public static void main(String[] args) {
		System.out.println("----------Dup-count -only----------");
		String str4 = "abcdefabccdeelq";
		Map<String, Long> count = Arrays.stream(str4.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("-----------Dupcount----------");
		List<String> dupCount = count.entrySet().stream().filter(t -> t.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(dupCount);
		System.out.println("-----------unique count----------");
		List<String> unique = count.entrySet().stream().filter(t -> t.getValue() == 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(unique);
	}
}
