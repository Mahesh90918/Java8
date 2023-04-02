package com.empTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMapTest {
	public static void main(String[] args) {
		Map<Empolyee, Integer> map = new HashMap<>();
		map.put(new Empolyee(1, "siva", 50000.4), 1);
		map.put(new Empolyee(2, "ravi", 15000.4), 2);
		map.put(new Empolyee(3, "prasad", 20000.4), 3);
		map.put(new Empolyee(4, "sriman", 25000.4), 4);
		map.put(new Empolyee(5, "shan", 30000.4), 5);
		map.put(new Empolyee(6, "subbu", 27000.4), 6);
		System.out.println("----------forward sort --------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey((a,b)->(int)(a.getSalary()-b.getSalary()))).forEach(System.out::println);
		System.out.println("----------reverse sort --------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey((a,b)->(int)(b.getSalary()-a.getSalary()))).forEach(t->System.out.println(t));
		System.out.println("-------------@---------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Empolyee::getName))).forEach(t->System.out.println(t));
		System.out.println("-------------------");
		map.entrySet().stream().sorted((a,b)->(int)(a.getKey().getSalary()-b.getKey().getSalary())).forEach(t->System.out.println(t));
	
	
	}
}
