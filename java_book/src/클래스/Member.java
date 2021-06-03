package 클래스;

public class Member {
	String name, id, password;
	int age;
	
	//기본 생성자
	public Member() {
		this("","","",0);
	}

	//모든 필드 초기화하는 생성자
	public Member(String id, String name, String password,  int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return name + " " + id + " " + password + " " + age;
	}

	@Override
	public boolean equals(Object obj) {
		Member m2 = ((Member)obj);
		return this.name.equals(m2.name) && this.id.equals(m2.id);
	}
	
	
	
}
