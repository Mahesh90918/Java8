package com.vidvaan.stucalender;

import java.util.Date;

public class StudentDateUtil {
	public long coursePeriod(Date startingDate, Date presentDate) {
		long periodOfDays = (startingDate.getTime() - presentDate.getTime()) / 86400000;
		return Math.abs(periodOfDays);

	}

}
