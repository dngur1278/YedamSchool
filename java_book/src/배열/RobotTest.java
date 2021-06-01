package 배열;

import 클래스.Robot;

public class RobotTest {

	public static void main(String[] args) {
		
		// 2. 객체 생성 
		Robot r = new Robot(2,4, "I1");
		System.out.println(r.getArm());
		System.out.println(r.getLeg());
		
		Robot r2 = new Robot(2,2, "I2");
		r2.print();
		
	}

}
