package co.yedam.app;
/*
 * 연산자 테스트
 * 논리: and(&&), or(||), not(!)
 * a++ -> a=a+1,  a-- -> a=a-1
 * ++a 
 * 조건? t : f  -> if 조건:
 * 				     ...
 *				  else:
 *				 	 ...
 */

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		int x = 1, y = 1;
		int x1 = 1,y1 = 1;
		int x2 = 1, y2 = 1;
	
		
		int result1 = ++x + 10;
		System.out.println(x + " " + result1);
		System.out.println(String.format("x=%d 결과=%d", x, result1));
		int result2 = y++ + 10;
		System.out.println(String.format("y=%d 결과=%d", y, result2));
		
		int result3 = ++x1 + y1++;
		System.out.println(String.format("x1=%d y1=%d 결과=%d",x1, y1, result3));
		
		int result4 = --x2 + y2--;
		System.out.println(String.format("x1=%d y1=%d 결과=%d",x2, y2, result4));
		
		//논리연산
		System.out.println( x>0 && y>0 );
		System.out.println( x==0 && y==0 );
		System.out.println( !(x==0 && y==0) );
		System.out.println( !(x==0) || !(y==0) );
		
		int x3 = 3;
		//삼항연산
		System.out.println(x>=0 && y>=0 ? "둘다양수" : "아님");
		System.out.println(x3%2==0 ? "짝수" : "홀수");
	}

}
