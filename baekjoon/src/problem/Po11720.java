package problem;
// 숫자합! 5 54321 -> 15
import java.util.Scanner;

public class Po11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		String s = scanner.next();
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += s.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
