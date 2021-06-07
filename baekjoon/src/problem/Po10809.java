package problem;

import java.util.Scanner;

/*
 *  문제: 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
 *       단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 
 *       경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class Po10809 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String s = scanner.nextLine();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}

}
