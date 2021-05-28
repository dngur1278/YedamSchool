package so.park.numbergame;

import java.util.Scanner;

/*
 *  숫자 맞추기 게임 
 *  작성자 : 박우혁
 * 컴퓨터가 임의의수를 입력
 * 사용자가 수를 입력하면 
 * 높다 낮다 판단 맞으면 앱 종료
 */
public class NumberGameApp {
	
	int com = (int)(Math.random()*100)+1;
	int user;
	boolean ok;
	
	Scanner sc = new Scanner(System.in);
	
	void init() {
		com = (int)(Math.random()*10)+1;
	}
	
	//사용자 수 입력
	void input() {
		System.out.print("숫자 입력:");
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
		init();
		while(true) {
			input();
			if(confirm() == true) {
				break;
			}
		}
	}
}
