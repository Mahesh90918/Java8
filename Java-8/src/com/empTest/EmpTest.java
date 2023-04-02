package com.empTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpTest {
	public static void main(String[] args) {
		List<Empolyee> al = new ArrayList<Empolyee>();
		al.add(new Empolyee(1, "mahesh", 10000.4));
		al.add(new Empolyee(2, "ravi", 15000.4));
		al.add(new Empolyee(3, "prasad", 20000.4));
		al.add(new Empolyee(4, "sriman", 25000.4));
		al.add(new Empolyee(5, "shan", 30000.4));

		List<Empolyee> collect = al.stream().sorted((a, b) -> (int) (b.getId() - a.getId()))
				.collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collectr = al.stream().map(t -> t.getId()).sorted().collect(Collectors.toList());
		System.out.println(collectr);

		List<Empolyee> collect2 = al.stream()
				.sorted(Collections.reverseOrder((a, b) -> (int) (a.getSalary() - b.getSalary())))
				.collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("====Start With s=======");
		List<Empolyee> collect3 = al.stream().filter(t -> t.getName().startsWith("s")).collect(Collectors.toList());

		System.out.println(collect3);
		System.out.println("------List to Map---------");
		Map<Integer, String> collect4 = al.stream().collect(Collectors.toMap(Empolyee::getId, t -> t.getName()));
		System.out.println(collect4);
		Map<Integer, String> collect5 = al.stream()
				.collect(Collectors.toMap(t -> t.getId(), t -> t.getName() + " " + t.getSalary()));
		System.out.println(collect5);

		System.out.println("====Second Highest========");
		Empolyee collect1 = al.stream().sorted((a, b) -> (int) (b.getSalary() - a.getSalary())).skip(1).findFirst()
				.get();
		System.out.println(collect1);
		Empolyee collect12 = al.stream().sorted((a, b) -> (int) (b.getSalary() - a.getSalary())).skip(1).findAny()
				.get();
		System.out.println(collect12);

	}
}
