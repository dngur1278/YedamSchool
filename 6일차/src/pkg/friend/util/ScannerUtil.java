package pkg.friend.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	static String format = "yyyy MM dd";
	
	public static int readInt() {	// 입력받은 문자열 -> 정수
		int a = scanner.nextInt();
		return a;
	}
	public static String readStr() {	// 입력받은 문자열
		String s = scanner.next();
		return s;
	}
	public static String readDate() {	// 입력받은 날짜인지 확인 하고 예외 처리
		String d = scanner.next();
		SimpleDateFormat df = new SimpleDateFormat(format);
		String date = df.format(d);
		return date;
	}
	//public static Friend readFriend() { // 프랜드 객체 생성해서 입력 받은값 스필릿해서 다시 객체에 담기
		
	//}
}
