package co.yedam.member;

public class Member {
	String name, id, password;
	int age;
	
	//기본 생성자
	public Member() {
		this("","","",0);
	}

	//모든 필드 초기화하는 생성자
	public Member(String id, String password, String name, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return name + " " + id + " " + password + " " + age;
	}
	
}
