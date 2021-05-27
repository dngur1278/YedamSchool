package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적처리 프로그램
 * 국어,영어,수학 입력 
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	
	int kor, eng, mat, sum;
	float avg;
	char grade;
	
	// 성적입력
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어성적:");
		kor = sc.nextInt();
		System.out.print("영어성적:");
		eng = sc.nextInt();
		System.out.print("수학성적:");
		mat = sc.nextInt();	
	}
	
	// 합계 계산
	int getSum() {
		sum = kor+eng+mat;
		return sum;
	}
	
	float getAvg() {
		avg = (float)sum/3;
		return avg;
	}
	
	boolean isPass() {
		//평균이 60이상이면 true
		//아니면 false
		if (avg >= 60) {
			return true;
		}
		else {
			return false;
		}
	}
	char getGrade() {
		switch ((int)avg/10) {
			case 10: 
			case 9: 
			case 8: grade = '상'; break;
			case 7: 
			case 6: 
			case 5: grade = '중'; break;
			default: grade = '하'; break;
		}
		return grade;
	}
	
}
