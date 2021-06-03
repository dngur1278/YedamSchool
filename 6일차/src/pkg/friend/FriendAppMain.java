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
		//등록 확인
		System.out.println("=== 등록 확인 ===");
		list.selectAll();
		System.out.println();
		//검색
		System.out.println("====  검색  ====");
		System.out.println( list.selectOne("홍길동"));
		//수정
		f = new SchoolFriend("초등학교", "김기자", "444");
		list.update(f);
		System.out.println();
		System.out.println("===업데이트 확인===");
		System.out.println( list.selectOne("김기자"));
		
		System.out.println();
		System.out.println("===   전체조회   ===");
		list.selectAll();
		
		//삭제
		list.delete("홍길동");
		
		//전체조회
		System.out.println();
		System.out.println("===전체조회 및 삭제 확인===");
		list.selectAll();
	}	
}
