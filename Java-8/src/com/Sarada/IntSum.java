package com.Sarada;

import java.util.Arrays;
import java.util.List;

public class IntSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int intStreamSum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("IntStream sum : " + intStreamSum);
	}
}
