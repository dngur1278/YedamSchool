package 배열;

import java.awt.Point;

/*
 * 객체배열 : 배열의 요소 타입이 객체인 경우
 */
public class 객체배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수선언
		Score[] a;
		a = new Score[10];
		a[0] = new Score("홍길동", 98, 91, 75);
		a[1] = new Score("김유신", 82, 100, 98);
		a[2] = new Score("이방지", 70, 72, 87);
		
		// 이름만 출력
		for (int i=0; i<a.length; i++) {
			if(a[i] != null) {
				System.out.println(a[i].name);
			}
		}
		
		// 선언과 동시에 초기화
		Score[] b = {new Score("홍길동", 98, 91, 75),
					new Score("김유신", 82, 100, 98),
					new Score("이방지", 70, 72, 87)};
		//이름과 총점을 출력
						// : -> in 배열변수 :b -> b배열의 요소 수 만큼 반복
		// 확장 for문
		for (Score score : b) {
			System.out.println("이름:"+score.name+" 총점:"+score.total);
		}
		
		// 객체배열
		Point[] c = {new Point(10, 10),
					new Point(10, 30),
					new Point(30, 10),
					new Point(30, 30)};
		
		// 확장 for문을 이용하여 x,y좌표 출력
		for (Point point : c) {
			System.out.println("x:"+point.x+" y:"+point.y);
		}
		
		/*
		 * 배열
		 * 얕은 복사 : 
		 * 깊은 복사 : 
		 */
	}

}
