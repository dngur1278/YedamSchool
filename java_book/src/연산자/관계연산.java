package 연산자;

public class 관계연산 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		// 앞의 관계식이 false면 뒤에 식은 실행x
		if (y++ > 10 && x++ > 10) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		System.out.println(x);
		System.out.println(y);
	}

}
