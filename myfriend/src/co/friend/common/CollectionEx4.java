package co.friend.common;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import co.friend.access.FriendDAO;
import co.friend.model.Friend;

public class CollectionEx4 {

	public static void main(String[] args) {
		// 이름 연락처 출력
		FriendDAO dao = new FriendDAO();
		Map<String, String> map = dao.getNameTel();
		
		// 
		Set<Entry<String, String>> ent = map.entrySet();
		
		// Iterator = 반복자!
		Iterator<Entry<String, String>> eiter = ent.iterator();
		
		// hasNext() : 다음 공백을 기준으로 문자열이 있는지 확인 후 boolean을 리턴
		while (eiter.hasNext()) {
			Entry<String, String> e = eiter.next();
			System.out.println(e.getKey()+ ", " + e.getValue());
		} 
	}

}
