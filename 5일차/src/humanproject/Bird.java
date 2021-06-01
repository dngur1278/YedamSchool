package humanproject;

public class Bird extends Animal implements Flyer{
	
	public Bird() { }
	
	@Override
	public void run() {
		super.run();
		System.out.println("새가 뜁니다.");
	}

	@Override
	public void eat() {
		System.out.println("새가 모이를 먹습니다.");
	}
	
	@Override
	public void takeOff() {
		System.out.println("새가 이륙합니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("새가 날아다닙니다.");
	}
	
	@Override
	public void land() {
		System.out.println("새가 착륙합니다.");
	}
	
	public void layEggs() {
		System.out.println("새가 알을 낳습니다.");
	}

}
