package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperation {
	public static void main(String[] args) {
		String str = "abcdefabccdee";
		Map<String, List<String>> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s));
		System.out.println(collect);
		// Now its count
		System.out.println("----------same letter diplay----------");
		String str1 = "abcdefabccdee";
		Map<String, List<String>> collect2 = Arrays.stream(str1.split(""))
				.collect(Collectors.groupingBy(Function.identity()));
		System.out.println(collect2);
		System.out.println("----------find Each char Occurs----------");
		String str2 = "abcdefabccdee";
		Map<String, Long> collect3 = Arrays.stream(str2.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect3);
		System.out.println("----------letter count----------");
		String str3 = "abcdefabccdee";
		Long collect4 = Arrays.stream(str3.split("")).collect(Collectors.counting());
		System.out.println(collect4);

		
	}
}
