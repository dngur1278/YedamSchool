package pkg.other;

import java.util.Date;

import pkg.friend.util.DateUtil;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(DateUtil.dateToStr(new Date()));
		System.out.println(DateUtil.dateToStr(new Date(), "yyyy"));
		
		System.out.println(DateUtil.durationDay("2021.07.01", "2021.06.03"));
		System.out.println(DateUtil.lastDay(2021, 6));
		
	}
}
