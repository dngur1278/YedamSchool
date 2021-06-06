package problem;
/*
 * 문제: 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 
 * 	    9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *      예를 들어 A = 150, B = 266, C = 427 이라면 
 *      A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
 *      계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 */

import java.util.Scanner;

public class Po2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int result = a * b * c;
		
		String st = Integer.toString(result);
			
		for (int i=0; i<10; i++) {
			int count = 0;
			for (int j = 0; j < st.length(); j++) {
				// charAt(j) - '0' 0을 넣어야 제대로된 값이 나온다
				// 0이나 48을 넣지 않으면 그에 대응하는 아스키코드 값이 나온다.
				if((st.charAt(j) - '0') == i) { 
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
