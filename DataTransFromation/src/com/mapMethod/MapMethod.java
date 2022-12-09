package com.mapMethod;

import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		EmployeeTest test = new EmployeeTest();
		// one to one go with Map
		List<String> mail = test.getAll().stream().map(Employee -> Employee.getEmail()).collect(Collectors.toList());
		System.out.println(mail);
		/// this is not correct way we can go with flapMap
		List<List<String>> phone = test.getAll().stream().map(emp -> emp.getPhonenum()).collect(Collectors.toList());
		System.out.println(phone);
	}
}
