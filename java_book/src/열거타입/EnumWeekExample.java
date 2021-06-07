package 열거타입;

import java.util.Scanner;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		
		// 배열
		// String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		// String today = week[6];
		
		// enum
		Week today = Week.SUN;
		Scanner sc = new Scanner(System.in);
		MENU menu = null;
		do {
			menu.print();
			int menuno = sc.nextInt();
			menu = MENU.getMenu(menuno);

			switch (menu){
				case 등록: System.out.println("등록"); break; 
				case 수정: System.out.println("수정"); break; 
				case 삭제: System.out.println("삭제"); break;
				case 조회: System.out.println("조회"); break;
			} 
		}while(menu != MENU.종료);
		System.out.println("종료");
	}
}
