package com.strings;

import java.util.Arrays;

public class FindMoreStringLength {
	public static void main(String[] args) {
		String[] str = { "my", "name", "is", "mahesh" };
		long count = Arrays.stream(str).count();
		System.out.println("words count :"+count);
		System.out.println("==================");
		String lengthCount = Arrays.stream(str)
				.reduce((word1, word2) -> word1.length() >  word2.length() ? word1 : word2).get();
		System.out.println(lengthCount);
		long count2 = Arrays.stream(lengthCount.split("")).count();
		System.out.println("Letters count :"+count2);
	}
}
