package co.yedam.app;

public class MemberInfoMain {
	public static void main(String[] args) {
		MemberInfo mi = new MemberInfo();
		mi.input();
		mi.heightWeightInput();
		
		mi.print();
		mi.bmi();
		System.out.println(mi.result);
		System.out.println(mi.bmi());
	}
}
