package problem;
/*
 *  문제: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Po10818 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if (min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min+" "+max);
	}

}
