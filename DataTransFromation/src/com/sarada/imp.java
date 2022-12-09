package com.sarada;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class imp {
	public static void main(String[] args) {
		String[][] array = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		Stream<String[]> stream1 = Arrays.stream(array);
		 String[] result = Stream.of(array)  // Stream<String[]>
		          .flatMap(Stream::of)        // Stream<String>
		          .toArray(String[]::new);    // [a, b, c, d, e, f]

		  for (String s : result) {
		      System.out.println(s);
		  }	}
}
