package com.StringExample;

import java.util.Arrays;

public class StringArray {
public static void main(String[] args) {
	String  s= "ABCD";
	int [] ii=new int[s.length()];
	for (int i = 0; i < s.length(); i++) {
		char  c=s.charAt(i);
		ii[i]=(int)c;
		System.out.println(ii[i]);
		
	}
	System.out.println(Arrays.toString(ii));
	for (int j = 0; j < ii.length; j++) {
		System.out.print(ii[j]+" ");
	}
}
}
