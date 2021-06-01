package 배열;

public class Score {
	String name;
	int kor, mat, eng, total;
	double avg;
	
	// 생성자 생성
	public Score(String name, int kor, int mat, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		
		this.total = kor + mat + eng;
		this.avg = (double)this.total/3;
	}
	
	
}
