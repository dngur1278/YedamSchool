package co.yedam.app.gugudan;

import java.util.*;

public class GugudanApp {
	
	int a;
	
	Scanner sc = new Scanner(System.in);
	
	void printDan() {
		System.out.print("원하는 단 입력: ");
		a = sc.nextInt();
		for(int i=a; i<a+1; i++) {
			for(int j=1; j<10; j++){
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
		}
	}
	
	void printRange(int s, int e) {
		//s단 부터 e단까지 출력
		for(int j=1; j<10; j++) {
			for(int i=s; i<=e; i++){
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	void printAll() {
		//9단까지 출력
		for(int j=1; j<10; j++) {
			for(int i=2; i<10; i++){
				System.out.printf("%d * %d = %d \t", i, j, i*j);
			}
			System.out.println();
		}
	}
}
