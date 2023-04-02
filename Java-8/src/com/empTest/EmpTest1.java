package com.empTest;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class EmpTest1 {
	public static void main(String[] args) {
		List<Empolyee> al = new ArrayList<Empolyee>();
		al.add(new Empolyee(1, "siva", 50000.4));
		al.add(new Empolyee(2, "ravi", 15000.4));
		al.add(new Empolyee(3, "prasad", 20000.4));
		al.add(new Empolyee(4, "sriman", 25000.4));
		al.add(new Empolyee(5, "shan", 30000.4));
		al.add(new Empolyee(6, "subbu", 27000.4));

		List<Empolyee> count = al.stream().filter(t -> t.getName().startsWith("s"))
				.sorted((a, b) -> (int) (b.getSalary() - a.getSalary())).collect(Collectors.toList());
		count.forEach(t -> System.out.println(t));

		System.out.println("----array of salary-----");
		List<Double> map = al.stream().map(t -> t.getSalary()).collect(Collectors.toList());
		System.out.println(map);
		System.out.println("-------Start with s and second highest Salary----");
		Empolyee empolyee = al.stream().filter(t -> t.getName().startsWith("s"))
				.sorted((a, b) -> (int) (b.getSalary() - a.getSalary())).distinct().skip(1).findAny().get();
		System.out.println(empolyee);
		System.out.println("-------find max salary-----");

		Empolyee empolyee2 = al.stream().max((a, b) -> (int) (a.getSalary() - b.getSalary())).get();
		System.out.println(empolyee2);

		System.out.println("------sum of salary-------");
		Double a1 = al.stream().map(t -> t.getSalary()).reduce((a, b) -> a + b).get();
		System.out.println(a1);
		Double b1 = al.stream().collect(Collectors.summingDouble(t -> t.getSalary()));
		System.out.println(b1);
		double sum = al.stream().mapToDouble(t -> t.getSalary()).sum();
		System.out.println(sum);
		System.out.println("------Avg of salary-------");
		double avg = al.stream().mapToDouble(t -> t.getSalary()).average().getAsDouble();
		System.out.println(avg);
		
	}
}
