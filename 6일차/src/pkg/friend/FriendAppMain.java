package pkg.friend;

import pkg.Friend;

public class FriendAppMain {
	
	public static void main(String[] args) {
		
		//등록
		FriendList list = new FriendList();
		Friend f = new CompanyFriend("현대해상", "홍길동", "222");
		list.insert(f);
		f = new SchoolFriend("초등학교", "김기자", "333");
		list.insert(f);
		//검색
		System.out.println( list.selectOne("홍길동"));
		//수정
		f = new SchoolFriend("초등학교", "김기자", "444");
		list.update(f);
		//삭제
		list.delete("홍길동");
		//전체조회
		list.selectAll();
		//단건조회
	}	
}
