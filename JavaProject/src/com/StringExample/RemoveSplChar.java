package com.StringExample;

public class RemoveSplChar {
	public static void main(String[] args) {
		String s = "uffdsaAASDFg353@$$@%4";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
				System.out.print(c + " ");

			}
		}
	}
}
