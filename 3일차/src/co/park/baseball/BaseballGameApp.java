package co.park.baseball;

import java.util.Scanner;

public class BaseballGameApp {
	
	int[] cu = new int[3];
	int[] us = new int[3];
	
	int s,b;
	int cnt;
	boolean game = true;
	
	Scanner sc = new Scanner(System.in);
	
	// 컴퓨터 난수 생성
	void computNum() {
		for(int i = 0; i < cu.length; i++) {
			cu[i] = (int)(Math.random()*9)+1;
			
			for(int j = 0; j < i; j++) {
				if(cu[j] == cu[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < cu.length; i++) {
			System.out.println(cu[i]);
		}
	}
	
	void userNum() {
		System.out.print("숫자를 입력해 주세요:");
		for (int i = 0; i < us.length; i++) {
			us[i] = sc.nextInt();
			
			if(us[i]<=0 || us[i]>=10) {
				System.out.print("1~9의 정수를 입력해주세요:");
			}
		}
	}
	
	void gameSet() {
		while(game) {
			userNum();
			for(int i=0; i<cu.length; i++) {
				for(int j=0; j<cu.length; j++) {
					if(cu[i] == us[j] && i == j) {
						s += 1;
					}
					else if (cu[i] == us[j] && i !=j) {
						b += 1;
					}
				}
			}
			
			System.out.printf("%dS %dB\n", s, b);
			
			if (s >= 3) {
				game = false;
			}
			cnt += 1;
			s=b=0;
		}
	}
	
	void gameStart() {
		computNum();
		gameSet();
		System.out.println("게임 횟수:" + cnt);
		System.out.println("게임 종료");
		sc.close();
	}
}
