package co.yedam.test;

public class CalcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		
		calc.turnOn();
		calc.sum(10, 20);
		calc.sum(10.5, 20.6);
		int r = calc.sum2(100, 200);
		System.out.println(r);
		System.out.println(calc.sum3(1,2,3,4));
		System.out.println(calc.sum3(1,2,3,4,5,6,7,8));
	}

}
