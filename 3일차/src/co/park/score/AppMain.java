package co.park.score;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. new 객체 생성
		ScoreArrApp saa = new ScoreArrApp();
		
		//4. 객체 이용(메서드 호출)
		saa.printH();
		//4자리로 출력하고 빈자리는 0으로 출력
		System.out.printf("합계:%04d점\n",saa.total());
		System.out.printf("평균:%.2f점",saa.avg());
	}

}
