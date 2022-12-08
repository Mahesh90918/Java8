package com.redex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regdex {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("The patient should be informed of his therapeutic options.");
		str.add("It wouldn't be as if the lone astronaut would be completely by himself.");
		str.add("Now, a writer is entitled to have a Roget on his desk.");
		str.add("Somebody should let you borrow their book");
		str.add("From the earliest times until about the 1960s");
		str.add("whether we may not, nay ought not, to use a neutral pronoun relative");
		str.add("phone 9280018281");
		str.add("Notionalplurality");
		str.add("A starting point would be to give more support");
		str.add("abc@gmail.com");
		ArrayList<Pattern> list = new ArrayList<>();
		list.add(Pattern.compile(".*\\.$"));
		list.add(Pattern.compile(".*\\d{10}.*"));
		list.add(Pattern.compile(".*@.*"));
		list.add(Pattern.compile("\\w+"));
		list.add(Pattern.compile(".*\\s.*"));
		for (Pattern p : list) {
			for (String str1 : str) {
				Matcher m = p.matcher(str1);
//				System.out.println(str1);
//				System.out.println(p);
		
				if (m.matches()) {
					MatchResult mat=m.toMatchResult();
					System.out.println("String:" +mat.groupCount() + " matches regex:" + m.end(0));
				}
			}
		}
	}
}
//String: 1 matches regex: 1
//String: 2 matches regex: 1
//String: 3 matches regex: 1
//String: 7 matches regex: 2
