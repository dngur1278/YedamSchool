package humanproject;

public class Human extends Animal {
	
	public Human() { }
	
	public void think() {
		System.out.println("사람이 생각을 합니다.");
	}

	@Override
	public void eat() {
		System.out.println("맛있는거 먹습니다.");
	}
}
