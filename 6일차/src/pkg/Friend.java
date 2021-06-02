package pkg;

public class Friend {
	protected String gubun;	// 학교명
	protected String name;	// 이름
	protected String tel;	// 전화번
	
	public Friend() {
		gubun = "";
	}
	
	public Friend(String gubun, String name, String tel) {
		super();
		this.gubun = gubun;
		this.name = name;
		this.tel = tel;
	}
	
	public void print() {
		System.out.printf("친구> 구분:%s  이름:%s  전화번호:%s ", gubun, name, tel);
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Friend [gubun=" + gubun + ", name=" + name + ", tel=" + tel + "]";
	}
}
