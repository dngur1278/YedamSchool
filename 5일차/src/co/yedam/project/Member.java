package co.yedam.project;

public class Member {
	
	private String name;
	private String phone;
	
	public Member() {  
		this("","");
	}
	
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "이름: " + name + " 전화번호: " + phone;
	}
	
	

}
