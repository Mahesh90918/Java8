package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamDemo {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5, 6, 7, 7, 4, 8, 9 };
		Stream<Integer> boxed = Arrays.stream(i).boxed();
		boxed.forEach(System.out::println);

		System.out.println("------------------------");
		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 7, 4, 8, 9 };
		Stream<Integer> stream = Arrays.stream(a);
		Stream<Integer> s = Stream.of(a);
		s.forEach(System.out::println);
		stream.forEach(System.out::println);
		System.out.println("============================");
		Stream<String> streamOfStrings = Stream.of("Sunday", "Monday", "Wednesday", "Friday");
		Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		streamOfStrings.forEach(System.out::println);
		streamOfIntegers.forEach(System.out::println);

		System.out.println("-----------------");
		Integer[] i1 = { 1, 2, 3, 4, 5, 6, 7, 7, 4, 8, 9 };
		List<Integer> list = Arrays.asList(i1);
		System.out.println("====parallel stream-----------------");
//			 parallel  format
		list.parallelStream().filter(e -> e % 2 == 0).forEach(System.out::println);
		System.out.println("========= stream==============");
//		 sequential  format
		list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
		
//		Stream using Stream.builder()
		Builder<String> builder = Stream.<String>builder(); // creating a builder
		builder.add("a").add("b").add("c"); // adding elements
		Stream<String> s2 = builder.build(); // creating stream
//		We can reduce above code to a one-liner as below:
		Stream<String> s1 = Stream.<String>builder().add("a").add("b").add("c").build(); 


	}

}
