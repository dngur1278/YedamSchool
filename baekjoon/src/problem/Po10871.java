package problem;
/*
 *  문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
 *  	 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Po10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int[] arr = new int[a];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i < arr.length; i++) {
			if (b > arr[i]) {
				System.out.print(arr[i]+ " ");
			}
		}
	}
}
