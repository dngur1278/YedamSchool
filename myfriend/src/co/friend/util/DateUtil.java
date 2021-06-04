package co.friend.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	static String format = "yyyy.MM.dd";
	
	//Date -> String	
	public static String dateToStr(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}
	
	public static String dateToStr(Date date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}
	
	// 두 날짜 사이의 일수 계산 
	public static long durationDay(String s1, String s2) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		long result = 0;
		try {
			Date d1 = df.parse(s1);
			Date d2 = df.parse(s2);
			result = d1.getTime() - d2.getTime();
			result = result/1000/60/60/24;
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		return result;
	}
	
	public static int lastDay(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int result = 0;
		cal.set(year, month-1, 1);
		//to do
		result = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		return result;
	}
	
}
