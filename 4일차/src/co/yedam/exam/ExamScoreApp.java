package co.yedam.exam;

import java.util.Scanner;

public class ExamScoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("수험번호를 입력해주세요....");
		String num = scanner.next();
		System.out.print("국어점수>>");
		int kor = scanner.nextInt();
		System.out.print("역사점수>>");
		int his = scanner.nextInt();
		System.out.print("영어점수>>");
		int eng = scanner.nextInt();
		 
		
		ExamScore es = new ExamScore(num, kor, his, eng);
		
		if (es.isPass() == true) {
			System.out.println("수험번호 "+num+"님\n축하드립니다!!!!\n합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
