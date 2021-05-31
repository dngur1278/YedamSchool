package co.yedam.numbergame;

import java.util.Scanner;

/*
 *  숫자 맞추기 게임 
 *  작성자 : 박우혁
 * 컴퓨터가 임의의수를 입력
 * 사용자가 수를 입력하면 
 * 높다 낮다 판단 맞으면 앱 종료
 * (과제) 다시 시작 물어보기
 * 
 */
public class NumberGameApp {
	
	int com;
	int user;
	boolean ok;
	char cel;
	
	Scanner sc = new Scanner(System.in);
	
	void init() {
		com = (int)(Math.random()*10)+1;
	}
	
	//사용자 수 입력
	void input() {
		System.out.print("숫자 입력(1~9):");
		user = sc.nextInt();
	}
	
	//높다 낮다
	boolean confirm() {
		if(com > user) {
			System.out.println("UP!");
			ok = false;
		}
		else if(com < user) {
			System.out.println("DOWN!");
			ok = false;
		}
		else if(com == user) {
			System.out.println("정답!");
			ok = true;
		}
		return ok;
	}
	
	void start() {
		boolean ok2;
		init();
		while(true) {
			input();
			ok2 = confirm();
			if(ok2 == true) {
				break;
			}
		}
		
		while(true) {
			ok2 = false;
			System.out.print("게임을 다시 시작하시겠습니까?(y/n)");
			cel = sc.next().charAt(0);
			if (cel == 'y' || cel == 'Y') {
				init();
				while(true) {
					input();
					ok2 = confirm();
					if(ok2 == true) {
						break;
					}
				}
			} else if(cel == 'n' || cel == 'N') {
				System.out.println("게임 종료!");
				break;
			} else {
				continue;
			}
		}
	}
}
