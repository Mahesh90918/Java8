package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum {
	public static void main(String[] args) {
//	 print even  number from another list

		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(2);
		al.add(45);
		al.add(54);
		al.add(3);
		al.add(67);

		System.out.println("-----------------------");
		ArrayList<Integer> al1 = new ArrayList<>();

		for (Integer i : al) {
			if (i % 2 == 0) {
				al1.add(i);
			}
		}
		System.out.println(al1);
		System.out.println("-----------------------");
		ArrayList<Integer> al2 = new ArrayList<>();
		for (int j = 0; j < al.size(); j++) {
//			System.out.println(al.get(j));
			if (al.get(j) % 2 == 0) {
				al2.add(al.get(j));
			}
		}
		System.out.println(al2);
	System.out.println("-----------java 8------------");
	ArrayList<Integer> al3 = new ArrayList<>();
	al.stream().filter(t->t%2==0).forEach(t->al3.add(t));
	System.out.println(al3);
	System.out.println("-----2nd Way-----");
	List<Integer> collect = al.stream().filter(t->t%2==0).collect(Collectors.toList());
	System.out.println(collect);
	}
}
