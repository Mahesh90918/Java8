package com.Employee;

import java.util.Comparator;

public class EmployeeSorting {
	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		System.out.println("***********NAME Sorting****************");
		emp.getEmpolyee().stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.forEach(System.out::println);
		System.out.println("***********name Sorting****************");

		emp.getEmpolyee().stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		System.out.println("***********NAMEEE Sorting****************");
		emp.getEmpolyee().stream().sorted(Comparator.comparing(emp1 -> emp1.getName()))
				.forEach(t -> System.out.println(t));
		System.out.println("***********NAMEEE REVERESE order Sorting****************");
		emp.getEmpolyee().stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.forEach(t -> System.out.println(t));
		System.out.println("***********SALARY Sorting****************");
		emp.getEmpolyee().stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
				.forEach(System.out::println);
		System.out.println("***********salary Sorting****************");

		emp.getEmpolyee().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		System.out.println("***********salary Sorting****************");
		emp.getEmpolyee().stream().sorted(Comparator.comparingDouble(emp1 -> emp1.getSalary()))
				.forEach(t -> System.out.println(t));
		//		Comparator<Employee> com = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		};
		System.out.println("***********Id Sorting****************");
		emp.getEmpolyee().stream().sorted((o1, o2) -> o1.getId() - o2.getId()).forEach(System.out::println);
		System.out.println("***********id Sorting****************");

		emp.getEmpolyee().stream().sorted(Comparator.comparing(Employee::getId)).forEach((t) -> System.out.println(t));
		System.out.println("***********id Sorting****************");
		emp.getEmpolyee().stream().sorted(Comparator.comparingInt(emp1 -> emp1.getId()))
				.forEach(t -> System.out.println(t));
		
		System.out.println("***********iddd Sorting****************");
		emp.getEmpolyee().stream().sorted(Comparator.comparing(emp1 -> emp1.getId()))
				.forEach(t -> System.out.println(t));
		
		
	}
}