package com.optionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.empTest.Empolyee;

public class EmpListTest {

	public static List<Empolyee> getAll() {
		List<Empolyee> al = new ArrayList<Empolyee>();
		al.add(new Empolyee(1, "mahesh", 10000.4));
		al.add(new Empolyee(2, "ravi", 15000.4));
		al.add(new Empolyee(3, "prasad", 20000.4));
		al.add(new Empolyee(4, "sriman", 25000.4));
		al.add(new Empolyee(5, "shan", 30000.4));
		return al;
	}

	public static void getName(String Str) {

		List<Empolyee> list = getAll();

		List<Empolyee> collect = list.stream().filter(t -> t.getName().equals(Str)).collect(Collectors.toList());

		Optional<Empolyee> findAny = collect.stream().findAny();
		if (findAny.isPresent()) {
			System.out.println(collect);
		} else {
			System.out.println("Null pointer ....");
		}
	}

	public static void getId(int id) {

		List<Empolyee> list = getAll();
		System.out.println("--------1 st Way---------");
		List<Empolyee> collect = list.stream().filter(t -> t.getId() == id).collect(Collectors.toList());
		String findAny = collect.stream().map(t -> t.getName().toUpperCase()).findAny().orElseGet(() -> "Null Finding");
		System.out.println(findAny);
		System.out.println("--------2 nd Way---------");
		String collect1 = list.stream().filter(t -> t.getId() == id).map(t -> t.getName().toUpperCase()).findAny()
				.orElseGet(() -> "Null Finding");
		System.out.println(collect1);

//		if (findAny.isPresent()) {
//			System.out.println(findAny.get());
//		}else {
//			System.out.println("Null pointer ....");
//		}
	}

	public static void main(String[] args) {

//		getName("mahesh1");

		getId(1);

	}
}
