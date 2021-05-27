package self;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;			// *출력할 때 사용할 변수 선언 
		int b = 3;			// 빈칸 출력할 때 사용할 변수 선언
		
		for (int i = 0; i < 7; i++) {      // 7번 반복
			if(i<3) {	// 1개 3개 5개 윗 부분 별 출력할 반복문
				for(int j = b; j>0; j--) {		// * 앞 부분 공백
					System.out.print(" ");
				}
				for(int j = 0; j<a; j++) {		// *출력
					System.out.print("*");
				}
				for(int j = b; j>0; j--) {		// * 뒷 부분 공백
					System.out.print(" ");
				}
				System.out.println();
				a +=2;
				b--;
			}
			else {
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				for(int j=a; j>0; j--) {
					System.out.print("*");
				}
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.println();
				a -=2;
				b++;
			}
		}
	}

}
