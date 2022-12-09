package com.mapMethod;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {
	public static void main(String[] args) {
		// one to many go with flatMap method

		EmployeeTest emp = new EmployeeTest();
		// flatMap Example
		List<String> phone = emp.getAll().stream().flatMap(empp -> empp.getPhonenum().stream())
				.collect(Collectors.toList());
		System.out.println(phone);

		// with sorting
		List<String> phone1 = emp.getAll().stream().flatMap(empp -> empp.getPhonenum().stream()).sorted()
				.collect(Collectors.toList());
		System.out.println(phone1);

		// with finding with filter
		List<String> phone2 = emp.getAll().stream().flatMap(empp -> empp.getPhonenum().stream())
				.filter(t -> t.startsWith("7")).collect(Collectors.toList());
		System.out.println(phone2);
		
	}
}
