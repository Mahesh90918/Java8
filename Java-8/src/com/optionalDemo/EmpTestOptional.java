package com.optionalDemo;

import java.util.Optional;

import com.empTest.Empolyee;

public class EmpTestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee emp = new Empolyee(1, null, 10000.4);
//		System.out.println(emp.getName().toUpperCase());

		Optional<String> op = Optional.ofNullable(emp.getName());
//		if (op.isPresent()) {
//			System.out.println(op.get());
//		} else {
//			System.out.println("fghjnkml");
//		}

		System.out.println(op.orElse("Null Available in Given Operation").toUpperCase());
		System.out.println(op.map(t -> t.toUpperCase()).orElse("Null Available in Given Operation"));

	}

}
