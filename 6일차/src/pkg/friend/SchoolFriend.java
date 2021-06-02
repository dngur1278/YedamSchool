package pkg.friend;

import pkg.Friend;

public class SchoolFriend extends Friend{
	
	String birth;	// 생일

	public SchoolFriend() {
		super();
	}

	public SchoolFriend(String gubun, String name, String tel, String birth) {
		super(gubun, name, tel);
		this.birth = birth;
	}
	
	public SchoolFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}

	@Override
	public void print() {
//		super.print();
//		System.out.println(" 생일:" + birth);
		System.out.printf("학교친구> %5s %5s %5s %5s\n", gubun, name, tel, birth);
	}
	
}
