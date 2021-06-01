package humanproject;

public abstract class Animal {
	
	public Animal() { }
	
	public void run() {
		System.out.println("달립니다.");
	}
	
	public abstract void eat(); 
	
	public void sleep() {
		System.out.println("잠을 잔다.");
	}

}
