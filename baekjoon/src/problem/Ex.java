package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex {
	
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		useBufferedReader();
	}
	
//	public static void useScanner() {
//		Scanner scanner = new Scanner(System.in);
//		
//		while(scanner.hasNextLine()) {
//			list.add(scanner.nextLine());
//		}
//		scanner.close();
//	}
	
	public static void useBufferedReader() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		while ((str = br.readLine() )!= null) {
			System.out.println(str);
		}
	}
}
