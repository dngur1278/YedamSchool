package vvvv;

import co.aaa.A;
import co.aaa.test.B;

public class Test {
	static {
		System.out.println(1 / 0);
	}

	public static void main(String[] args) {
		System.out.println("HELLO");
	}
}