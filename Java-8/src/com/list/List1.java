package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class List1 {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 7, 66, 5, 443, 3);
		al.stream().skip(3).limit(4).forEach(System.out::print);
		System.out.println();
		al.stream().sorted().skip(3).limit(5).forEach(System.out::print);
		System.out.println();
		long count = al.stream().count();
		System.out.println(count);
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s.skip(9).limit(6).forEach(t -> System.out.print(t + " "));
		System.out.println("\n"+"----------------------");
		al.stream().sorted(Comparator.comparing(a->a)).forEach(System.out::println);

	}
}
