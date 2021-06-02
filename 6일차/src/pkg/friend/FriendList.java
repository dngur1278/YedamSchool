package pkg.friend;

import java.util.ArrayList;
import java.util.List;

import pkg.Friend;

public class FriendList implements FriendAccess {
	List<Friend> friends;
	
	public FriendList() {
		friends = new ArrayList<Friend>();
	}

	@Override
	public void insert(Friend friend) {
		friends.add(friend);
	}

	@Override
	public void update(Friend friend) {
		
	}

	@Override
	public void delete(String name) {
		
	}

	@Override
	public void selectAll() {
		System.out.println("FriendList");
	}

	@Override
	public Friend selectOne(String name) {
		for (Friend f : friends ) {
			if(f.getName().equals(name)) {			// contains : 이름 일부 찾을 때, equals : 완전히 일치 할 때
				return f;
			}
		}
		return null;
	}
}
