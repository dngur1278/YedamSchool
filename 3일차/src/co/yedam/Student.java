package co.yedam;
/*
 * 클래스 선언 --> new 클래스 선언 --> 필드or메서드 호출 실행
 * 1. 클래스 선언
 * 	  class 이름 {       }
 */
public class Student {
	// 필드 + 메서드
	String name;
	String no;
	
	void print() {
		System.out.println(name + ":" + no);
	}
}
