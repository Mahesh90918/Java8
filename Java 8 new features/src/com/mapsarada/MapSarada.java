package com.mapsarada;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.java8.list;

public class MapSarada {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		System.out.println(map);

		List<Entry<String, Integer>> list = map.entrySet().stream().filter(t -> t.getKey().startsWith("f"))
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("==================================");
		map.entrySet().stream().filter(t -> t.getKey().startsWith("f")).forEach(t -> System.out.println(t));
		System.out.println(list);
	}
}
