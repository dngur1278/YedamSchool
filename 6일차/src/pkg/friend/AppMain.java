package pkg.friend;

import pkg.Friend;

public class AppMain {

	public static void main(String[] args) {
		Friend f = new CompanyFriend("삼성", "홍길동", "1111", "과장");
		f.print();
		
		Friend f1 = new SchoolFriend("중앙고", "홍길동", "2222", "1월 1일");
		f1.print();
		
		// 다형성 (상속받고 오버로딩)
		// 1. 부모타입의 참조변수가 지식객체를 참조가능
		// 2. 매서드 실행하면 참조 대상의 매서드가 호출
		FriendManager manager = new FriendManager();
		for (Friend fr : manager.friends) {
			if (fr instanceof SchoolFriend)
				fr.print();
		}
	}

}
