package com.StringExample;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TwoStrAdd1 {
	public static void main(String[] args) {
		String s = "ram20 sita30";
		String split[] = s.split(" ");
		String chh = "";
		int ii = 0;
		for (int i = 0; i < split.length; i++) {
			char ch[] = split[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {
				if (ch[j] >= '0' && ch[j] <= '9') {
					chh += ch[j];

					ii = Integer.parseInt(chh);
				}
				ii=ii+ii;
			}
		}
		System.out.println(ii);
	}
}
