package com.StringExample;

public class Odd {
	static String getReverseString(String inputString) {
		String reverse = " ";
		for (int i1 = inputString.length()-1; i1 >= 0; i1--) {
			reverse += inputString.charAt(i1);

		}
		return reverse;
	}

	public static void main(String[] args) {
		String s = "Our core Java programming tutorial is designed for students and working professionals";
		String[] words = s.split(" ");
		String outputstring = " ";
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 1) {// 0,2,4,6,8, even printing capital
				outputstring += words[i].toUpperCase()+" ";
			} else {
				outputstring += getReverseString(words[i]) + " ";

			}
//			if (i != words.length-1) {
//				outputstring +=  " ";
//			}
		}
		System.out.println(outputstring);
	}
}
