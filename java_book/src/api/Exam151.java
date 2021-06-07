package api;

class Bird {
	public void fly() {
		System.out.print("Fly");
	}
}

class Peacock extends Bird {
	public void dance() {
		System.out.print("Dance");
	}
}

public class Exam151 {
	public static void main(String[] args) {
		Bird b = new Peacock();
		Peacock p = (Peacock)b;
		
		p.fly();
		p.dance();
	}
}
