package back;

import java.util.Scanner;

public class Bj2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (min - 45 < 0) {
			min = 60 + (min - 45);
			hour = hour -1;
			if (hour < 0) {
				hour = 23;
			}
			System.out.printf("%d %d", hour, min);
		} else {
			min = 60 + (min - 45);
			System.out.printf("%d %d", hour, min);
		}
	}

}
