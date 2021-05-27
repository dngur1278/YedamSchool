package co.yedam.app.score;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreApp sa = new ScoreApp();
		
		sa.input();
		System.out.println("합계:" + sa.getSum() + "  " + 
						"평균:" + sa.getAvg() + "  " + 
						"등급:" +sa.getGrade());
		
		System.out.println("합격여부: " + (sa.isPass()? "합격" : "불합격"));
	}

}
