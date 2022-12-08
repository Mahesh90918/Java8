package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Zero", 1);
		map.put("one", 2);
		map.put("two", 3);
		map.put("three", 4);
		map.put("four", 5);

// Set<Entry<String, Integer>> set=map.entrySet();
// for(Entry<String, Integer> ss:set) {
//	 System.out.println(ss.getKey() +" "+ss.getValue());
// }
		// 1.way
		System.out.println("============================");
		map.forEach((key, value) -> System.out.println(key + value));
		System.out.println("============================");
		// 2. way
		map.entrySet().stream().forEach((mahesh) -> System.out.println(mahesh.getKey() + mahesh.getValue()));
		System.out.println("============================");
		// 3.way

		map.entrySet().stream().filter((t) -> t.getKey().startsWith("o"))
				.forEach((mahesh) -> System.out.println(mahesh.getKey() + mahesh.getValue()));
		System.out.println("============================");
		// 4.way
		map.entrySet().stream().filter((t) -> t.getValue() > 2)
				.forEach((mahesh) -> System.out.println(mahesh.getKey() + mahesh.getValue()));
	}
}
