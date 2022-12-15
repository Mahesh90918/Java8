package com.mapEmpolyee;

import java.util.Comparator;
import java.util.Map;

import com.java8.map;

public class EmployeeSorting {
	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		System.out.println("***********NAME Sorting****************");
		emp.getEmpolyee().entrySet().stream().sorted((o1, o2) -> o1.getKey().getName().compareTo(o2.getKey().getName()))
				.forEach(System.out::println);
		System.out.println("***********NAME Sorting Revese****************");
		emp.getEmpolyee().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
				.forEach(System.out::println);

		System.out.println("***********SALARY Sorting****************");
		emp.getEmpolyee().entrySet().stream()
				.sorted((o1, o2) -> (int) (o1.getKey().getSalary() - o2.getKey().getSalary()))
				.forEach(System.out::println);
//		Comparator<Employee> com = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		};
		System.out.println("***********Id Sorting****************");
		emp.getEmpolyee().entrySet().stream().sorted((o1, o2) -> o1.getKey().getId() - o2.getKey().getId())
				.forEach(System.out::println);
		System.out.println("***********value Sorting****************");
		emp.getEmpolyee().entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
				.forEach(System.out::println);
		System.out.println("-----------------Name 1------------------");
		emp.getEmpolyee().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(emp1 -> emp1.getName())))
				.forEach(t -> System.out.println(t));
		System.out.println("-----------------Name 1 reverse------------------");
		emp.getEmpolyee().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
				.forEach(t -> System.out.println(t));
		System.out.println("------------+++NAME 2+++---------------------");
		emp.getEmpolyee().entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
				.forEach(t -> System.out.println(t));
		System.out.println("------------+++Reverse Order 2+++---------------------");
		emp.getEmpolyee().entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
				.forEach(t -> System.out.println(t));
		System.out.println("------------+++value 2+++---------------------");
		emp.getEmpolyee().entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t -> System.out.println(t));

	}
}
