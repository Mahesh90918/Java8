package com.listToMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.list;

public class ListToMap {
	public static void main(String[] args) {
		List<Student> a = new ArrayList<>();
		a.add(new Student(01, "Siva", 1234));
		a.add(new Student(02, "mahesh", 1234));
		a.add(new Student(03, "Sriman", 1234));
		a.add(new Student(04, "shan", 1234));
		a.add(new Student(05, "RAvi", 1234));
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (Student s : a) {
			map.put(s.id, s.name);
		}
		System.out.println(map);
		System.out.println("-----------------------");
		Map<Integer, String> map1 = a.stream().collect(Collectors.toMap(Student::getId, Student::getName));
		System.out.println(map1);
		System.out.println("-----------------------");
		Set<Entry<Integer, String>> set = map1.entrySet();
		for (Entry<Integer, String> ee : set) {
			System.out.println(ee);
		}
		a.stream().collect(Collectors.toMap(Student::getId, Student::getName))
				.forEach((m, v) -> System.out.println(m + " => " + v));

		
	}

}
