package co.park.score;

public class ArrayApp {
	
	int[] arr = new int[10];
	
	// 배열 초기값 출력
	void init() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}
	
	//배열 출력
	void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열[%d]의 값:%d \n", i, arr[i]);
		}
	}
	
	//합계
	int arrSum() {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.printf("배열의 합:%d\n",total);
		return total;
	}
	
	//최대값
	int arrMax() {
		int max = arr[0];
		for(int i=1; i<arr.length; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.printf("최대값:%d",max);
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayApp aa = new ArrayApp();
		
		aa.init();
		aa.print();
		aa.arrSum();
		aa.arrMax();
	}
}
