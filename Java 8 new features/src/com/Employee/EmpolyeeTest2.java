package com.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmpolyeeTest2 {
	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		List<Employee> list = emp.getEmpolyee().stream().filter(t -> t.getSalary() > 10000)
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("-------------------");
		emp.getEmpolyee().stream().filter(t -> t.getSalary() > 10000).forEach(t -> System.out.println(t));
		System.out.println("++++++++++++++=====");
		emp.getEmpolyee().stream().filter(t -> t.getSalary() > 10000).forEach(System.out::println);

	}
}
