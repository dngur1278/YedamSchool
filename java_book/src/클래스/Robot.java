package 클래스;

// 1. 클래스 선언
public class Robot {
	
	// 필드
	// private : 클래스 내부에서만 접근 가능 -> 접근제어자
	private int arm;
	private int leg;
	private String name;
	
	// 생성자 오버로딩 가능
	// 기본 생성자
	public Robot() { } 		// <-- 컴파일러가 만들어주는 기본 생성자
	
	public Robot(int arm, int leg, String name) {
		this.arm = arm;		// this는 자기자신 객체를 참조하는 참조변수 
		this.leg = leg;
		this.name = name;
		
	}
	
	public Robot(int arm, int leg) {
		this.arm = arm;
		this.leg = leg;
	}
	
	// setter: 필드값을 변경
	public void setArm(int arm) {
		this.arm = arm;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
		
	//일반 메서드
	public void print() {
		System.out.printf("arm:%d leg:%d name:%s", arm, leg, name);
	}
		
	// getter: 필드값을 조회
	public int getArm() {
		return this.arm;
	}
	public int getLeg() {
		return this.leg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Robot r2 = ((Robot)obj);
		return r2.arm == this.arm && r2.leg == this.leg;
	}

	@Override
	public String toString() {
		return "arm: "+arm+" leg: "+leg;
	}
	
	
}
