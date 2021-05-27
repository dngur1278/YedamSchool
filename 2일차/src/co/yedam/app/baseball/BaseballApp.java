package co.yedam.app.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseballApp {
	
	int s;
	int b;
	int c1,c2,c3;
	int u1,u2,u3;
	
	Scanner sc = new Scanner(System.in);
	
	
	void makeRnd() {
		Random rm = new Random();
		c1 = rm.nextInt();
		c2 = rm.nextInt();
		c3 = rm.nextInt();
		if (c1 == c2) {
			c2 = rm.nextInt();
		}
		else if(c1 == c3) {
			c3 = rm.nextInt();
		}
		else if(c2 == c3) {
			c3 = rm.nextInt();
		}
	}
	
	//유저 번호 입력
	void input() {
		System.out.print("유저 번호:");
		u1 = sc.nextInt();
		u2 = sc.nextInt();
		u3 = sc.nextInt();
	}
	
	//s,b 카운터
	void count() {
		
	}
	
	void start() {
		while(s < 3) {
			s=b=0;
			input();
			count();
		}
	}
}
