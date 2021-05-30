package co.park.star;

public class StarApp {
	
	void drawTitle(String s, int cnt) {
		for (int i=0; i<cnt; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println(s);
		for (int i=0; i<cnt; i++) {
			System.out.print("=");
		}
		System.out.println();
		
	}
	
	
	//삼각형 출력
	void draw(int cnt) {
		for(int i=1; i<=cnt; i++ ) {
			System.out.println(pad('*', i));
		}
	}
	//직각 삼각형	
	String pad(char a, int cnt) {
		String result = "";
		for(int i=0; i<cnt; i++) {
			result += a;
		}
		return result;
	}
	
	//이등변 삼각형
	void drawEq(int cnt) {
		for(int i=1; i<cnt; i++) {
			System.out.print(pad(' ', 50+(cnt-i)));
			System.out.println(pad('*', i*2-1));
		}
	}
	
	void drawEq(int a, int cnt) {
		for(int i=a; i<cnt; i++) {
			if (cnt<7) {
				System.out.print(pad(' ', 48+(cnt-i)));
			}
			else if (cnt<9) {
				System.out.print(pad(' ', 46+(cnt-i)));
			}
			System.out.println(pad('*', i*2-1));
		}
	}
	
	void drawRact(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print(pad(' ', 46+(cnt+2)));
			System.out.println(pad('*', cnt-1));
		}
	}
}
