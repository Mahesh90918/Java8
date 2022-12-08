package com.StringExample;

import java.util.Arrays;

public class StringArray2 {
public static void main(String[] args) {
	String s []= {"123","456","987"};
	int [] a=new int[s.length];
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
		
		a[i]=Integer.parseInt(s[i]);
	}
	System.out.println(Arrays.toString(a));
}
}
