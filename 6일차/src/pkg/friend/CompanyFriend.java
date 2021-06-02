package pkg.friend;

import pkg.Friend;

public class CompanyFriend extends Friend {

	String duty; // 직급

	public CompanyFriend() {
		super();
	}

	public CompanyFriend(String gubun, String name, String tel, String duty) {
		super(gubun, name, tel);
		this.duty = duty;
	}

	public CompanyFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}

	@Override
	public void print() {
//		super.print();
//		System.out.println(" 직급:" + duty);
		System.out.printf("회사친구> %5s %5s %5s %5s\n", gubun, name, tel, duty);
	}

}
