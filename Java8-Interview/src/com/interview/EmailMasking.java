package com.interview;

public class EmailMasking {
	public static void main(String[] args) {
		String email = "ddrewrerwefg@gmail.com";
		String maskedEmail = maskEmail(email);
		System.out.println(maskedEmail);
	}

	public static String maskEmail(String email) {
		String[] parts = email.split("@");
		String username = parts[0];
		String domain = parts[1];

		StringBuilder maskedUsername = new StringBuilder();
		for (int i = 0; i < username.length(); i++) {
			if (i == 0) {
				maskedUsername.append(username.charAt(i));
			} else {
				maskedUsername.append("*");
			}
		}

		StringBuilder maskedDomain = new StringBuilder();
		maskedDomain.append(domain.charAt(0));
		maskedDomain.append("****");
		maskedDomain.append(domain.charAt(domain.length() - 1));

		return maskedUsername.toString() + "@" + maskedDomain.toString();
	}
}
