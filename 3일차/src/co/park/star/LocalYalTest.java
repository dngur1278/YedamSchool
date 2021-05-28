package co.park.star;

// 지역변수 - 스택
public class LocalYalTest {
	int a,b;
	
	public void method1() {
		int a = 10;
		method2();
		{
			int b= 10;
			b++;
		}
		System.out.println(a+ ":" + b);
		
	}
	
	public void method2() {
		a = 20;
		a++;
	}
	
	public static void main(String[] args) {
		int a = 100;
		LocalYalTest local = new LocalYalTest();
		local.method1();
		System.out.println(a);
	}
}
