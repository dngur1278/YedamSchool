package 클래스;

public class RobotTest {
	
	public static void change(int a) {
		a += 10;
	}
	
	public static void change(Robot robot) {
		robot.setArm(5);
	}

	public static void main(String[] args) {
		
		// 2. 객체 생성 
		Robot r = new Robot(2,4);
		change(r);
		r.getArm();
		System.out.println(r.getArm());
		
		int a = 1;
		change(a);
		System.out.println(a);
		
//		Robot r2 = new Robot(2,2, "I2");
//		r2.print();	
	}
}
