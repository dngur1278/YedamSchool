package co.yedam;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 = 인스턴스
		StudentApp app = new StudentApp();
		Student student = app.createStudent();
		student.print();
	}

}
