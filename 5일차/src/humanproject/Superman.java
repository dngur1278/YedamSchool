package humanproject;

public class Superman extends Human implements Flyer{
	
	public Superman() { }
	
	@Override
	public void takeOff() {
		System.out.println("Superman이 이륙합니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("Superman이 날아다닙니다.");
	}
	
	@Override
	public void land() {
		System.out.println("Superman이 착륙합니다.");
	}

}
