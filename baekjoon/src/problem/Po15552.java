package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Po15552 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;   //하나의 문자열을 여러 개의 문자열로 분리
		
		for (int i =0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");	//문자열 분리를 위해 반복
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			// String 타입을 Integer.parseInt로 int형으로 변환
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
