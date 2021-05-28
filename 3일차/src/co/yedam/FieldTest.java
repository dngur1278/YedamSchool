package co.yedam;

public class FieldTest {
	
	int a = 10, b = 10;
	
	public void method1() {
		a++;
	}
	
	public static void main(String[] args) {
		FieldTest ft = new FieldTest();
		ft.method1();
		System.out.println(ft.a);
	}
}
