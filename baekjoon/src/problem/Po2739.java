package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Po2739 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = num; i <= num; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i +" * " + j + " = " + (i*j));
			}
		}
	}
}
