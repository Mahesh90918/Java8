package com.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
	public List<Employee> getEmpolyee() {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(01, "siva", 10000.00);
		Employee e2 = new Employee(02, "mahesh", 15000.00);
		Employee e3 = new Employee(03, "ravi", 13000.00);
		Employee e4 = new Employee(04, "sriman", 14000.00);
		Employee e5 = new Employee(05, "shan", 17000.00);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		return list;
	}

	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		System.out.println("***************************");
		emp.getEmpolyee().stream().forEach((t) -> System.out.println(t));
		System.out.println("***************************");
		emp.getEmpolyee().stream().filter((t) -> t.getSalary() > 14000).forEach((t) -> System.out.println(t));
		System.out.println("***************************");
		emp.getEmpolyee().stream().filter((t) -> t.getName().startsWith("s")).forEach((t) -> System.out.println(t));
		System.out.println("***************************");
		emp.getEmpolyee().stream().filter((t) -> t.getName().contains("mahesh")).forEach((t) -> System.out.println(t));
	}
}
