package co.yedam.exam;

public class ExamScore {
	
	String examNum;
	int kor, his, eng;
	
	int avg;

	public ExamScore(String examNum, int kor, int his, int eng) {
		super();
		this.examNum = examNum;
		this.kor = kor;
		this.his = his;
		this.eng = eng;
		
		avg = (kor+his+eng)/3;
	}
	
	boolean isPass() {
		boolean result;
		if (avg>=60 && kor>40 && his>40 && eng>40) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
}
