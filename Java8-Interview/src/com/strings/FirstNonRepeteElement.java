package com.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeteElement {
	public static void main(String[] args) {
		// LinkedHashMap does follow insertion order
		String str4 = "iloveindila";
		LinkedHashMap<String, Long> linkedHashMap = Arrays.stream(str4.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String NonRepete = linkedHashMap.entrySet().stream().filter(t -> t.getValue() == 1).findFirst().get().getKey();
		System.out.println(NonRepete);
		String Repete = linkedHashMap.entrySet().stream().filter(t -> t.getValue() > 1).findFirst().get().getKey();
		System.out.println(Repete);
		System.out.println("------------------------");
		// map does not follow insertion order
		String str = "iloveindila";
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		String key1 = map.entrySet().stream().filter(t -> t.getValue() == 1).findFirst().get().getKey();
		System.out.println(key1);

	}
}
