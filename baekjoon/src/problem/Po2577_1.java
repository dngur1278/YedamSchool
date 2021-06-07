package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Po2577_1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int re = a * b * c;
		
		//valueOf()의 값을 String으로 변환
		String s = String.valueOf(re);
		
		for (int i = 0; i < s.length(); i++) {
			arr[(s.charAt(i) - '0')]++;
		}
		
		for (int num : arr) {
			System.out.println(num);
		}
		
	}

}
