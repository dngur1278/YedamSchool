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
		for(Friend f : friends) {
			if (f.getName().equals(friend.getName()) && f.getGubun().equals(friend.getGubun())) {
				friends.set(friends.indexOf(f), friend);
			}
		}
//		if (friends.get(0).getName() == friend.getName()) {
//			friends.set(0, friend);
//		}
//		else if (friends.get(1).getName() == friend.getName()) {
//			friends.set(1, friend);
//		}
	}

	@Override
	public void delete(String name) {
		for (Friend f : friends) {
			if(f.getName().equals(name)) {
				friends.remove(f);
			}
		}
		
//			if (friends.get(0).getName() == name) {
//				friends.remove(0);
//			}
//			else if (friends.get(1).getName() == name) {
//				friends.remove(0);
//			}	
	}

	@Override
	public void selectAll() {
		System.out.println(friends);
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
