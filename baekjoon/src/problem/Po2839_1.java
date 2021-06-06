package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Po2839_1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int bong = Integer.parseInt(br.readLine());
		
		if (bong == 4 || bong == 7) {
			System.out.println("-1");
		}
		else if(bong % 5 == 0) {
			System.out.println(bong/5);
		}
		else if ((bong % 5 == 1) || (bong % 5 == 3)) {
			System.out.println((bong/5) + 1);
		}
		else if ((bong % 5 == 2) || (bong % 5 == 4)) {
			System.out.println((bong/5) + 2);
		}
		
		br.close();
	}

}
