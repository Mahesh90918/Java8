package com.vidvaan.utildate;

import java.util.TimeZone;

public class TimeZoneExa {

	public static void main(String[] args) {
		String id[] = TimeZone.getAvailableIDs();
		for (int i = 0; i < id.length; i++) {
			// System.out.println(id[i]);
			TimeZone zone = TimeZone.getTimeZone(id[i]);
			System.out.println(id[i] + "==>" + zone.getDisplayName());
		}

	}

}
