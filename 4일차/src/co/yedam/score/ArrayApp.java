package co.yedam.score;

import java.util.Scanner;

public class ArrayApp {

	int[] score;			// 성적
	int studentNum;			// 학생수
	
	Scanner sc = new Scanner(System.in);
	
	void init() {
		System.out.print("학생수> ");
		studentNum = sc.nextInt();
		score = new int[studentNum];
	}
	
	void input() {
		for (int i= 0; i < score.length; i++) {
			System.out.printf("score[%d]> ", i);
			score[i] = sc.nextInt();
		}
	}
	
	void print() {
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d]> %d\n", i, score[i]);
		}
	}
	
	int arrMax() {
		int max = score[0];
		for(int i=1; i<score.length; i++ ) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.printf("최고 점수: %d\n", max);
		return max;
	}
	
	double arrAvg() {
		double avg = 0;
		for (int i =0; i < score.length; i++) {
			avg += score[i];
		}
		avg = avg/score.length;
		System.out.printf("평균 점수: %.2f\n", avg);
		return avg;
	}
	
	public static void main(String[] args) {
		
		ArrayApp app = new ArrayApp();
		Scanner sc1 = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc1.nextInt();
			
			if (selectNo == 1) {
				app.init();
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.print();
			} else if (selectNo == 4) {
				app.arrMax();
				app.arrAvg();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}

