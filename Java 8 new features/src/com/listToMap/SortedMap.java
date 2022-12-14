package com.listToMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortedMap {
	public static void main(String[] args) {
		Map<Student, Integer> map = new LinkedHashMap<Student, Integer>();
		map.put(new Student(01, "siva", 1234), 1);
		map.put(new Student(05, "mahesh", 4321), 2);
		map.put(new Student(04, "shan", 213), 4);
		map.put(new Student(02, "ravi", 1212), 3);
		map.put(new Student(03, "sriman", 1212), 5);
		System.out.println(map);

		System.out.println("-=-==-=-=--=Convert map to List-=-=-=-=-=-=-=-");
		List<Entry<Student, Integer>> list = new ArrayList(map.entrySet());
		System.out.println(list);
		System.out.println("-=-==-=-=--=Sorting Normal=====");
		Collections.sort(list, new Comparator<Entry<Student, Integer>>() {

			@Override
			public int compare(Entry<Student, Integer> o1, Entry<Student, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().getName().compareTo(o2.getKey().getName());
			}
		});
		System.out.println(list);
		System.out.println("-=-==-=-=--=Sorting value Normal=====");
		Collections.sort(list, new Comparator<Entry<Student, Integer>>() {

			@Override
			public int compare(Entry<Student, Integer> o1, Entry<Student, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(list);
		System.out.println("-=-==-=-=-Sorting With TreeMAp-=-=-=-=-=-=-=-=-");
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		TreeMap<Student, Integer> tree = new TreeMap(comp);
		tree.put(new Student(01, "siva", 1234), 1);
		tree.put(new Student(05, "mahesh", 4321), 2);
		tree.put(new Student(04, "shan", 213), 4);
		tree.put(new Student(02, "ravi", 1212), 3);
		tree.put(new Student(03, "sriman", 1212), 5);
		System.out.println(tree);

		System.out.println("--------------java8--------------");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(emp1 -> emp1.getName())))
				.forEach(t -> System.out.println(t));

		System.out.println("==================");
		map.entrySet().stream().sorted((o1,o2)->o1.getKey().getName().compareTo(o2.getKey().getName())).forEach(t -> System.out.println(t));
	
		System.out.println("==================");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId))).forEach(t -> System.out.println(t));
		
	}
}
