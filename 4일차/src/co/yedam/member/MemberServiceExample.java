package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			
			System.out.println("===========================================================");
			System.out.println("1.등록 | 2.전체조회 | 3.번호로조회 | 4.로그인 | 5.id로 조회 | 6.종료");
			System.out.println("===========================================================");
			System.out.print("입력> ");
		
			int selectNo = scanner.nextInt();
		
			if (selectNo == 1) {
				memberService.insert();
			} else if (selectNo == 2) {
				memberService.printList();
			} else if (selectNo == 3) {
				memberService.printNum();
			} else if (selectNo == 4) {
				System.out.print("ID>>");
				String id1 = scanner.next();
				System.out.print("PW>>");
				String pw2 = scanner.next();
				memberService.login(id1, pw2);
			} else if(selectNo == 5) {
				memberService.printId();
			} else if(selectNo == 6) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
				
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("ID>>"); String id = sc.next();
		 * 
		 * System.out.print("PASSWORD>>"); String password = sc.next();
		 * System.out.println();
		 * 
		 * boolean result = memberService.login(id, password);
		 * 
		 * if(result) { System.out.println("로그인 되었습니다."); memberService.logout("hong");
		 * } else { System.out.println("id 또는 password가 올바르지 않습니다."); }
		 */


