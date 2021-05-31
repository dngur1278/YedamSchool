package co.yedam.emp;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee el = new Employee();
		
		Employee e2 = new Employee(100, "홍길동");
		System.out.println(e2);
		
		Employee e3 = new Employee(101, "김유신", "a@a.c");
		System.out.println(e3);
		
		Employee e4 = new Employee(102, "유관순", 2500);
		System.out.println(e4);
		
		Employee e5 = new Employee(103, "무휼", 10, 5000, "m@naver.com");
		System.out.println(e5);
	}
}
