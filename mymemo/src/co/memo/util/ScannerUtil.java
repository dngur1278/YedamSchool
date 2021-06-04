package co.memo.util;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import co.memo.model.Memo;

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
				System.out.println("숫자가 아닙니다.");
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

	public static Memo readMemo() { // 프랜드 객체 생성해서 입력 받은값 스필릿해서 다시 객체에 담기
		System.out.print("날짜>>");
		String d = scanner.next();
		System.out.print("내용>>");
		String c = scanner.next();
		Memo memo = new Memo(d, c);
		return memo;
	}
	
	//여러줄 입력
	public static String readMultiLine()	{
		StringBuffer result = new StringBuffer();
		try {
			String a = "";
			while(true) {
				a = scanner.next();
				if (a == null || a.trim().equals(".end")) {
					break;
				}
				result.append(a).append("\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}
