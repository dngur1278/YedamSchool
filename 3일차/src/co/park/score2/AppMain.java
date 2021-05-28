package co.park.score2;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreArr2App sa2 = new ScoreArr2App();
		//Scanner sc = new Scanner(System.in);
		//System.out.print("학생번호 입력:");
		//int a = sc.nextInt();
	
		//sa2.print();
		
		//sa2.arr.length --> 3
		
		for (int i =0; i < sa2.arr.length; i++) {
			System.out.printf("%d번 학생의 총점:%-8d",i, sa2.stdTotal(i));
			System.out.printf("%d번 학생의 과목수:%-2d\n",i, sa2.getSbjCnt(i));
		}
	}

}
