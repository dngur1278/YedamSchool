package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Po4344_1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		double sum, mean, cnt;
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(br.readLine());
			arr = new int[n];
			
			sum = 0;
			
			for (int j = 0; j < n; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}
			
			mean = (sum/n);
			cnt = 0;
			
			for (int j = 0; j < n; j++) {
				if(arr[j] > mean) {
					cnt++;
				}
			}
			System.out.printf("%3.f%%\n", (cnt/n)*100);
			
		}
	}

}
