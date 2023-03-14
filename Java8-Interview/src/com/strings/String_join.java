package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class String_join {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("1", "2", "5", "8");

		String join = String.join("-", asList);
		System.out.println(join);
		System.out.println("------------------");
		IntStream.range(1, 10).skip(1).limit(8).forEach(System.out::println);
	}

}
