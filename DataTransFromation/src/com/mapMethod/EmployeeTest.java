package com.mapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(01, "siva", "siva@jhdh", Arrays.asList("873466432", "6234642634")));
		list.add(new Employee(02, "sriman", "sri@jhdh", Arrays.asList("76234234", "234325435")));
		list.add(new Employee(03, "shan", "sh@jhdh", Arrays.asList("7658768", "354325432")));
		list.add(new Employee(04, "ravi", "ravi@jhdh", Arrays.asList("8768668567", "7687658675")));
		list.add(new Employee(05, "mahesh", "mahesh@jhdh", Arrays.asList("76876867876", "45676574576")));
		return list;

	}public static void main(String[] args) {
		EmployeeTest te=new EmployeeTest();
		te.getAll().forEach(t->System.out.println(t));
	}

}
