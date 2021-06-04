package co.friend.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.friend.model.Friend;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt(String prompt) {
		System.out.print(prompt + ">>");
		return readInt();
	}

	public static int readInt() { // 숫자
		int result = 0;
		while (true) {
			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public static String readStr(String prompt) {
		System.out.print(prompt + ">>");
		return readStr();
	}

	public static String readStr() { // 입력받은 문자열
		String result = "";
		while (true) {
			try {
				result = scanner.next();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static String readDate(String prompt) {
		System.out.print(prompt + ">>");
		return readDate();
	}

	public static String readDate() { // 입력받은 날짜인지 확인 하고 예외 처리
		String result = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		do {
			try {
				result = scanner.next();
				df.parse(result.trim()); // trim 공백 제거
				break;
			} catch (Exception e) {
				System.out.println("(yyyyMMdd)날짜 형식이 아닙니다.");
			}
		} while (true);
		return result;
	}

	public static Friend readFriend() { // 프랜드 객체 생성해서 입력 받은값 스필릿해서 다시 객체에 담기
		System.out.print("구분 이름 전화번호>>");
		String f = scanner.next();
		String[] arr = f.split(",");
		Friend friend = new Friend(arr[0], arr[1], arr[2]);
		return friend;
	}
}
