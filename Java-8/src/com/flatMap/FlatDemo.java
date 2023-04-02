package com.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatDemo {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();
		list1.add(12);
		list1.add(12);
		list1.add(12);
		List<Integer> list2 = new ArrayList();
		list2.add(123);
		list2.add(123);
		list2.addAll(list1);
		Stream<Integer> flatMap = Arrays.asList(list1, list2).stream().flatMap(t -> t.stream());
		System.out.println(flatMap.collect(Collectors.toList()));

	}

}
