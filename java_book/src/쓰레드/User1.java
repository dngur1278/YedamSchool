package 쓰레드;

public class User1 extends Thread{
	private Calculator calculator;

	public void run() {
		calculator.setMemory(100);
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User1");
	}
	
	
}
