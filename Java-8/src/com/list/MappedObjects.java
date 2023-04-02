package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MappedObjects {
	public static void main(String[] args) {
//		 print every number is doubled from another list
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(2);
		al.add(45);
		al.add(54);
		al.add(3);
		al.add(67);
		System.out.println(al);
		System.out.println("-----------------------");
		ArrayList<Integer> al1 = new ArrayList<>();

		for (Integer i : al) {
			al1.add(i * 2);
		}
		System.out.println(al1);
		System.out.println("----------java 8-------------");
//         using map
		List<Integer> collect = al.stream().map(i -> i * 2).collect(Collectors.toList());
		System.out.println(collect);
//		System.out.println("----- ------");
//		ArrayList<Integer> al2 = new ArrayList<>();
//		 al.stream().forEach(t->al2.add(t*2));
//		System.out.println(al2);
	}
}
