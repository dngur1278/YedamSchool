package co.yedam.app;

import java.util.Scanner;

/*
 * 계산기 게임
 * 사칙연산, 진수변환, 문자값 검사
 */
public class CalcGame {
	double a, b;
	
	//1 ~cnt까지의 합을 계산해서 리턴
	int sum(int cnt) {
		int result = 0;
		for (int i = 1; i <= cnt; i++) {
			result+=i;
		}
		return result;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		String s1 = sc.next();
		String s2 = sc.next();
		
		a = Double.parseDouble(s1);
		b = Double.parseDouble(s2);
	}
	//정수값 두 수의 합을 계산하는 메서드(함수)
	double add() {
		return a+b;
	}
	// 두 수의 몫을 계산
	int share() {
		return (int)(a/b); 
	}
	// 두 수의 나눗셈 
	double div() {
		return a/b; 
	}
	// 두 수의 나머지 계산
	int rest() {
		return (int)(a%b); 
	}
	
}
