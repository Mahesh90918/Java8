package com.redex;

import java.util.regex.Pattern;

public class PhoneNumbers {
	public static void main(String[] args) {

		boolean p=Pattern.matches("[6][3][0-9]{8}","6301390918");
		System.out.println(p);
		System.out.println(Pattern.matches("[6][0-9]{8}", "6301390918"));  
		System.out.println(Pattern.matches("[6][0-9]{9}", "6301390918"));  
		System.out.println(Pattern.matches("[6]\\d{9}", "6301390918"));  
		System.out.println(Pattern.matches("[689]\\d{9}", "8301390918"));  
		System.out.println(Pattern.matches("[689]{1}\\d{9}", "9301390918"));  
		System.out.println(Pattern.matches("[689]?\\d{9}", "9601390918"));  
		System.out.println(Pattern.matches("0[6][0-9]{9}", "06301390918"));  
		System.out.println(Pattern.matches("91[6][0-9]{9}", "916301390918")); 
		System.out.println(Pattern.matches("(0|91)?[689]?\\d{9}", "916301390918"));
		System.out.println(Pattern.matches("(0|91)?[689]?\\d{9}", "06301390918"));
	
	}
}
