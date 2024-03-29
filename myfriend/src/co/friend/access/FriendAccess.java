package co.friend.access;

import java.util.ArrayList;

import co.friend.model.Friend;
/**
 * 
 * 인터페이스 : 상수필드 + 추상메서드
 * 상수필드 : public static final
 * 메서드 : public abstract
 */
// 친구 관리 개발 시 개발 표준 
public interface FriendAccess {
	
	//등록 
	public void insert(Friend friend);
	
	//수정
	public void update(Friend friend);
	
	//삭제
	public void delete(String name);
	
	//전체조회
	public ArrayList<Friend> selectAll();
	
	//단건조회
	public Friend selectOne(String name);
	
	public Friend selectTel(String tel);
	
}
