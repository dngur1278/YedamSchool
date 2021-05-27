package co.yedam.app;

import java.util.Scanner;

public class MemberInfo {
	
	Scanner sc = new Scanner(System.in);
	String name, id, tel;
	double height, weight;
	
	double result = 0;
	String s = "";
	
	void heightWeightInput() {
		System.out.print("키(cm):");
		height = sc.nextDouble();
		System.out.print("몸무게(kg):");
		weight = sc.nextDouble(); 
	}
	
	String bmi() {
		result = weight/(height/100*height/100);
		if (result < 18.5) {
			s = "저체중";
		}
		else if (result < 23) {
			s = "정상";
		}
		else if (result < 25) {
			s = "과체중";
		}
		else if (result < 30) {
			s = "비만";
		}
		else if (30 <= result) {
			s = "고도비만";
		}
		return s;
	}
	
	
	void input() {
		int a = 10;
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		name = sc.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		id = sc.next();
		System.out.print("3. 전화번호: ");
		tel = sc.next();
	}
	
	void print() {
		System.out.println();
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(id);
		System.out.println(tel);
	}

}
