package co.yedam.app.baseball;

import java.util.Random;
import java.util.Scanner;


import jdk.swing.interop.SwingInterOpUtils;

public class BaseballApp {

	int s, b;
	int c1,c2,c3;
	int u1,u2,u3;

	Scanner sc = new Scanner(System.in);

	void makeRnd() {

		Random rm = new Random();
		c1 = rm.nextInt(9)+1;
		c2 = rm.nextInt(9)+1;
		while (c1 == c2) {
			c2 = rm.nextInt(9)+1;
		}
		
		c3 = rm.nextInt(9)+1;
		while (c1 == c3 || c2 == c3) {
			c3 = rm.nextInt(9)+1;
		}
	}

	void input() {
		System.out.print("숫자 입력:");
		u1 = sc.nextInt();
		u2 = sc.nextInt();
		u3 = sc.nextInt();
	}

	void count() {
		input();
		if (u1 == c1) {
			s+=1;
		}
		else if (u1 == c2 ||u1 == c3) {
			b+=1;
		}
			
		if(u2 == c2) {
			s+=1;
		}
		else if(u2 == c1 || u2 == c3) {
			b+=1;
		}
			
		if(u3 == c3) {
			s+=1;
		}
		else if(u3 == c1 || u3 == c2) {
			b+=1;
		}
		
		System.out.printf("S:%d B:%d",s,b);
		System.out.println();
	}

	void start() {
		while(s < 3) {
			s=b=0;
			count();
		}
		System.out.println("The end!");
	} 
}
