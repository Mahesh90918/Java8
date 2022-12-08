package com.java8;

import java.util.ArrayList;
import java.util.List;

public class list {
public static void main(String[] args) {
	List<Integer> al=new ArrayList<Integer>();
	al.add(12);
	al.add(22);
	al.add(32);
	al.add(15);
	al.add(17);
//		for (Integer integer : al) {
//		System.out.println(integer);
//	}
	System.out.println("============================");
	al.forEach((mahesh)->System.out.println(mahesh));
	System.out.println("============================");
	al.stream().filter((t)->t>15).forEach((mahesh)->System.out.println(mahesh));
	System.out.println("============================");
	
	List<String> al1=new ArrayList<String>();
	al1.add("zero");
	al1.add("one");
	al1.add("two");
	al1.add("three");
	
	al1.forEach((mahesh)->System.out.println(mahesh));
	System.out.println("============================");
	al1.stream().forEach((mahesh)->System.out.println(mahesh));
	System.out.println("============================");
	al1.stream().filter((t)->t.startsWith("t")).forEach((mahesh)->System.out.println(mahesh));
	System.out.println("============================");
	al1.stream().filter((t)->t.startsWith("t")).forEach((mahesh)->System.out.println(mahesh));
}
}
