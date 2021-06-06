package problem;

import java.util.Scanner;

/*
 * 문제: 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
 *      당신은 그들에게 슬픈 진실을 알려줘야 한다.
 */
public class Po4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr;
		
		int num = scanner.nextInt();
		
		for (int i=0; i<num; i++) {
			
			int num2 = scanner.nextInt();	//학생 수
			arr = new int[num2];
			double sum = 0;		// 성적 합
			
			for (int j=0; j < num2; j++) {
				int val = scanner.nextInt();	// 성적 입력
				arr[j] = val;
				sum += val; // 성적 누적 합
			}
			
			double mean = (sum/num2);
			double cnt = 0;	// 평균 넘는 학생 수 변수
			
			for (int j = 0; j < num2; j++) {
				if(arr[j] > mean) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/num2)*100);
			
			
		}
	}

}
