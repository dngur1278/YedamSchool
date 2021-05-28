package co.park.star;

public class StarApp {
	
	//삼각형 출력
	void draw(int cnt) {
		for(int i=1; i<=cnt; i++ ) {
			System.out.println(pad('*', i));
		}
//		for(int i=1; i<9; i++ ) {
//			for(int j=1; j<9; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	//직각 삼각형	
	String pad(char a, int cnt) {
		String result = "";
		for(int i=0; i<cnt; i++) {
			result += a;
		}
		return result;
	}
	
	void drawInvert(int cnt) {
		for(int i=cnt; i>0; i-- ) {
			System.out.println(pad('*', i));
		}
	}
	
	//이등변 삼각형
	void drawEq(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print("     ");
			System.out.print(pad(' ', cnt-i));
			System.out.println(pad('*', i*2-1));
		}
	}
}
