package com.Employee;

public class streamMatches {
	public static void main(String[] args) {
		EmployeeTest emp = new EmployeeTest();
		boolean result = emp.getEmpolyee().stream().allMatch(t -> t.getName().matches("mahesh"));
		System.out.println(result);
		boolean result1 = emp.getEmpolyee().stream().anyMatch(t -> t.getName().matches("mahesh"));
		System.out.println(result1);
		boolean result2 = emp.getEmpolyee().stream().noneMatch(t -> t.getName().matches("mahesh"));
		System.out.println(result2);
		System.out.println("------------");
		boolean result3 = emp.getEmpolyee().stream().noneMatch(t -> t.getName().matches("sdfsfd"));
		System.out.println(result3);
		
	}
}
