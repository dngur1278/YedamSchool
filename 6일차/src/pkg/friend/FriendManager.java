package pkg.friend;

import java.util.List;

import pkg.Friend;

public class FriendManager implements FriendAccess{
	Friend[] friends = new Friend[5];
	
	public FriendManager() {
		friends[0] = new CompanyFriend("예담회사", "순이", "010-1111-7777");
		friends[1] = new SchoolFriend("중앙초등", "돌이", "010-2222-7777");
		friends[2] = new SchoolFriend("중앙고", "이방원", "010-3333-7777");
		friends[3] = new CompanyFriend("삼성", "홍길동", "010-4444-7777");
		friends[4] = new CompanyFriend("삼성", "강감찬", "010-5555-7777");
	}
	
	@Override
	public void insert(Friend friend) {
		
	}

	@Override
	public void update(Friend friend) {
		
	}

	@Override
	public void delete(String name) {
		
	}

	@Override
	public void selectAll() {
		System.out.println("FriendManager");
	}

	@Override
	public Friend selectOne(String name) {
		return null;
	}

}
