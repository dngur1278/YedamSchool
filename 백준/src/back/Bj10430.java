package back;

import java.util.Scanner;

public class Bj10430 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[3];
		
		for (int i = 0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		int a1 = (a[0]+a[1])%a[2];
		int a2 = ((a[0]%a[2]) + (a[1]%a[2]))%a[2];
		int a3 = (a[0]*a[1])%a[2];
		int a4 = ((a[0]%a[2]) * (a[1]%a[2]))%a[2];
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}

}
