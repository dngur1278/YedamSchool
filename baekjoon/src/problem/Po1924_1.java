package problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Po1924_1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int count = 0;

		// 월만큼 다 더하기
		for (int i = 0; i < x; i++)
			count += month[i];

		// 일수 더하기
		count += y;

		System.out.println(day[count % 7]);
	}

}
