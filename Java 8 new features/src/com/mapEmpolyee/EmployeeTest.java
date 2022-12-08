package com.mapEmpolyee;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTest {

	public Map<Employee, String> getEmpolyee() {
		Map<Employee, String> map = new LinkedHashMap<Employee, String>();
		Employee e1 = new Employee(01, "siva", 10000.00);
		Employee e2 = new Employee(02, "mahesh", 15000.00);
		Employee e3 = new Employee(03, "ravi", 13000.00);
		Employee e4 = new Employee(04, "sriman", 14000.00);
		Employee e5 = new Employee(05, "shan", 17000.00);
		map.put(e1, "one");
		map.put(e2, "two");
		map.put(e3, "three");
		map.put(e4, "four");
		map.put(e5, "five");
		return map;
	}

	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		System.out.println("***************************");
		emp.getEmpolyee().entrySet().stream().forEach((key)->System.out.println(key.getKey()+" ="+key.getValue()));
		System.out.println("***************************");
		emp.getEmpolyee().entrySet().stream().forEach(System.out::println);
		System.out.println("***************************");
		emp.getEmpolyee().entrySet().stream().filter((t) -> t.getKey().getSalary()>13000).forEach((t) -> System.out.println(t));
		System.out.println("***************************");
		emp.getEmpolyee().entrySet().stream().filter((t) -> t.getKey().getName().startsWith("s")).forEach((t) -> System.out.println(t));
		System.out.println("***************************");
		emp.getEmpolyee().entrySet().stream().filter((t) -> t.getValue().startsWith("f")).forEach((t) -> System.out.println(t));
	}
}
