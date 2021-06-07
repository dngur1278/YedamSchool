package problem;

import java.util.Scanner;

/*
 * 오늘은 2007년 1월 1일 월요일이다. 
 * 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 */
public class Po1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayOfTheWeeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int totalDays = day;
		for (int i = 0; i < month - 1; ++i) {
			totalDays += daysInMonth[i];
		}

		System.out.println(dayOfTheWeeks[totalDays % 7]);
	}

}
