package co.friend.view;

import java.util.List;

import co.friend.access.FriendList;
import co.friend.model.Friend;
import co.friend.util.ScannerUtil;

public class FriendCliApp {

	FriendList friendList = new FriendList();

	public void start() {
		int menunum;
		do {
			menuTitle(); // 매뉴 출력
			menunum = ScannerUtil.readInt("입력>"); // 매뉴 선택
			switch (menunum) {
			case 1:
				insert();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				selectAll();
				break;
			case 5:
				findName();
				break;
			case 6:
				findTel();
				break;
			}
		} while (menunum != 0);
	}

	public void menuTitle() {
		System.out.println("============      친구관리      ============");
		System.out.println("1.친구추가 | 2.친구수정 | 3.친구삭제 | 4.전체조회");
		System.out.println("5.이름으로조회 | 6.전화번호 검색 | 0.종료");		
		System.out.println("==========================================");
	}
	
	public void insert() {
		Friend friend = ScannerUtil.readFriend();
		friendList.insert(friend);
	}
	
	public void update() {
		Friend friend = new Friend();
		friend.setName(ScannerUtil.readStr("이름"));
		friend.setTel(ScannerUtil.readStr("전화번호"));
		friendList.update(friend);
	}
	
	public void delete() {
		String name = ScannerUtil.readStr();
		friendList.delete(name);
	}
	
	public void selectAll() {
		List<Friend> list = friendList.selectAll();
		for (Friend friend : list) {
			System.out.println(friend);
		}
	}

	public void findName() {
		String name = ScannerUtil.readStr("이름");
		Friend friend = friendList.selectOne(name);
		System.out.println(friend);
	}
	
	public void findTel() {
		String tel = ScannerUtil.readStr("전화번호");
		Friend friend = friendList.selectTel(tel);
		System.out.println(friend);
	}



}
