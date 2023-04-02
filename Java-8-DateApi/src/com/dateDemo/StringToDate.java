package com.dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "01-Apr-2023";

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		String dateInString1 = "07/06/2013";

		Date date;
		Date date1;
		try {
			date = formatter.parse(dateInString);
			date1 = formatter1.parse(dateInString1);
			System.out.println(date);
			System.out.println(formatter.format(date));
			System.out.println(date1);
			System.out.println(formatter1.format(date1));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
