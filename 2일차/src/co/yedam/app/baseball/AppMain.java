package co.yedam.app.baseball;

public class AppMain {

	public static void main(String[] args) {
		BaseballApp ba = new BaseballApp();
		ba.makeRnd();
		System.out.println(ba.c1+","+ba.c2 +","+ ba.c3);
		ba.start();
	}
}
