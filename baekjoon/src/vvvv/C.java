package vvvv;

class A {
	public void test() {
		System.out.println("A");
	}
}

class B extends A {
	public void test() {
		System.out.println("B");
	}
}

public class C extends A {
	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new C();
		b1 = (A) b2; // line n1
		A b3 = (B) b2; // line n2
		b1.test();
		b3.test();
	}
}