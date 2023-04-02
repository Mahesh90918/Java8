package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(2);
		al.add(45);
		al.add(54);
		al.add(3);
		al.add(67);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Forward sorting  :" + al);
		Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		System.out.println("Reverse sorting  :" + al);

		System.out.println("----------------------------------------");
		Collections.sort(al, (a, b) -> a - b);
		System.out.println(" java 8 Forward sorting  :" + al);
		System.out.println("----------------------------------------");
		Collections.sort(al, (a, b) -> b - a);
		System.out.println(" java 8 Reverse sorting  :" + al);

	}
}
