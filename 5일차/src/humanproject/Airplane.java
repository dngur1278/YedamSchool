package humanproject;

public class Airplane implements Flyer{
	
	public Airplane() { }

	@Override
	public void takeOff() {
		System.out.println("비행기가 이륙합니다.");
	}

	@Override
	public void fly() {
		System.out.println("비행기가 주행 중입니다.");
	}

	@Override
	public void land() {
		System.out.println("비행기가 착륙합니다.");
	}
	
}
