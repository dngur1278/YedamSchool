package 배열;

/*
 *  배열 : 크기고정
 *  순차적으로 데이터를 저장하고 읽는 용도
 *  추가/삭제 번거로움
 */

public class 배열초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1차원 배열
		// 배열선언 
		int[] a; 			// 객체 -> new 힙 메모리 할당
		a = new int[10];
		// 초기화
		a[0] = 10;			// 배열 크기가 10이면 0~9까지 사용가능
		a[1] = 20;			// 설정안한 배열은 초기값이 0
		a[2] = 100;
		a[3] = 70;
		
		//삭제 (인덱스 다음부터 앞으로 이동)
		for (int i=2; i <a.length; i++) {
			a[i-1] = a[i];
		}
		
		// 배열출력
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 배열 선언과 초기화를 한꺼번에
		int[] b = {100,200,300};		// <-- new int[3] {100,200,300}
		System.out.println("배열크기:"+b.length);
		
	}
}
