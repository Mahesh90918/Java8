package com.sarada;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class imp {
	public static void main(String[] args) {
		String[][] array = new String[][] { { "a", "b","f" }, { "c", "d" ,"g"}, { "e", "f" },{"g","h","j"} ,{ "a", "b" ,"p"}, { "c", "d" },{ "a", "b" }, { "c", "d" },{ "a", "b" }, { "c", "d" },{ "a", "b" }, { "c", "d" }};
		 String[] result = Stream.of(array)  // Stream<String[]>
		          .flatMap(Stream::of)        // Stream<String>
		          .toArray(String[]::new);    // [a, b, c, d, e, f]

		 System.out.println(Arrays.toString(result));
		  for (String s : result) {
		      System.out.println(s);
		  }	}
}
