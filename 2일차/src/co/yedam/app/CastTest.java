package co.yedam.app;

import java.util.Scanner;

/*
 * 형변환: 캐스트연산자 (타입)
 * 전수형: byte < short < int < long
 * 실수형:               float < double
 * 										string -> 기본타입        기본타입 -> string
 * String   -----------> byte      ->  Byte.parseByte(변수)  /   String.valueOf()
 * 						 short     ->  Short.parseShort		
 * 						 int       ->  Integer.parseInt
 * 						 long      ->  Long.parseLong
 * 						 float
 * 						 double
 * 						 char
 * 						 boolean 
 */

public class CastTest {

	public static void main(String[] args) {
		//자동 형변환
		int a = 10;
		long b = a;
		
		//강제변환
		a = (int)b;
		
		//char(문자) <-> int(코드)
		char c = 'A';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		//double(실수) <-> int(정수)
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
		
		//수식 내에서 자동으로 형변환
		double g = 5 + 10.5;
		String h = "hi" + 5;
		
		System.out.println(g);
		System.out.println(h);
		System.out.println("hi" + 5 + 10);
		System.out.println(5 + 10 + "hi");
		
		// 정수 끼리 연산 결과는 정수
		double i = 5/(double)2;
		System.out.println(i);
		
		//string -> int 
		String s1 = "123";
		int j = Integer.parseInt(s1);
		System.out.println(j);
		
		//int -> String
		String s2 = String.valueOf(123);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		String greet = scanner.next();
		System.out.println(greet);
	}
}
