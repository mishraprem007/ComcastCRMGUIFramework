package com.comcast.crm.generic.genericJavaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber() {
		Random random = new Random();
		int randomInt = random.nextInt(5000);
		return randomInt;
	}

	public String getSystemDateYYYYDDMM() {
		Date dateobj = new Date();
		// if want to capture only date with simple format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);
		return date;
	}

	public String getRequiredDateYYYYMMDD(int days) {
		Date dateobj = new Date();
		// if want to capture only date with simple format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(dateobj);
		// for new 30 days from calender class
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate = sdf.format(cal.getTime());
		return reqDate;

	}
}
