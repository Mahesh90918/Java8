package com.mapsarada;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.listToMap.Student;

public class mapSorting {
	public static void main(String[] args) {
		Map<Student, Integer> map = new LinkedHashMap<Student, Integer>();
		map.put(new Student(01, "siva", 10000), 1);
		map.put(new Student(05, "mahesh", 15000), 2);
		map.put(new Student(04, "shan", 14000), 4);
		map.put(new Student(02, "ravi", 13000), 3);
		map.put(new Student(03, "sriman", 16000), 5);
		System.out.println(map);

		System.out.println("+++++++++++++++++++++++++");
		List<String> list = map.entrySet().stream().filter(t -> t.getKey().getFee() < 15000)
				.map(t -> t.getKey().getName()).collect(Collectors.toList());
		list.forEach(t -> System.out.println(t));
		System.out.println("+++++++++++++++++++++++++");
		map.entrySet().stream().filter(t -> t.getKey().getFee() < 15000).map(t -> t.getKey().getName())
				.forEach(t -> System.out.println(t));

	}
}
