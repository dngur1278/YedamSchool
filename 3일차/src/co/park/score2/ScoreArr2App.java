package co.park.score2;

public class ScoreArr2App {
	//2차원배열
			 	  // k   e  m
	int[][] arr = { {100,90,80,40},
					{80,70},
					{90,30,90,100,98},
					{60,90,70}};
	
	void print() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//입력한 번호의 한 학생의 총점
	int stdTotal(int no) {
		int result = 0;
		for(int i = 0; i < arr[no].length; i++) {
			result += arr[no][i];
		}
		return result;
	}
	
	//해당 학생의 과목수
	int getSbjCnt(int no) {
		return arr[no].length;
	}
}
