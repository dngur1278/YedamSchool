package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성(인스턴스)
		Car myCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " +myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 50;
		System.out.println("현재속도: " + myCar.speed);
		
		Car newCar = new Car();
		newCar.company = "기아자동차";
		newCar.model = "k7";
		newCar.color = "흰색";
		newCar.maxSpeed = 400;
		
		//생성자
		Car youCar = new Car("르노","SM6","블루");
		System.out.println(youCar);
		
		Car miniCar = new Car("코나", 100);
		System.out.println(miniCar);
		
		}

}
