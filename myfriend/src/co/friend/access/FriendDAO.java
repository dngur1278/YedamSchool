package co.friend.access;
// FriendAccess.java, FriendList.java

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.friend.model.Friend;
import co.friend.util.DAO;

public class FriendDAO extends DAO implements FriendAccess{
	
	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	Scanner scanner = new Scanner(System.in);
	
	// name, tel 값을 담아주는 컬렉션
	public Map<String, String> getNameTel(){
		sql = "select name,tel from friend";
		Map<String, String> map = new HashMap<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				map.put(rs.getString("name"), rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	//등록
	public void insert(Friend friend) {
		try {
			psmt = conn.prepareStatement("insert into friend values(?, ?, ?)");
			psmt.setString(1, friend.getGubun());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			
			int r = psmt.executeUpdate();
			System.out.println("~~~~~~~~~~~~~  친구 등록 완료  ~~~~~~~~~~~~~");
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	// 수정 
	// 동일한 이름은 없음.
	public void update(Friend friend) {
		sql = "update friend set tel=? where name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, friend.getTel());
			psmt.setString(2, friend.getName());
			
			int r = psmt.executeUpdate();
			System.out.println("~~~~~~~~~~~~~  정보 수정 완료  ~~~~~~~~~~~~~");
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//삭제
	public void delete(String name) {
		try {
			psmt = conn.prepareStatement("delete from friend where name=?");
			psmt.setString(1, name);
			
			int r = psmt.executeUpdate();
			System.out.println("~~~~~~~~~~~~~  친구 손절 완료  ~~~~~~~~~~~~~");
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//전체조회
	public ArrayList<Friend> selectAll() {
		ArrayList<Friend> fList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Friend friend = new Friend();
				friend.setGubun(rs.getString("gubun"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				
				fList.add(friend);	// 데이터 건수 만큼 ArrayList에 담아서 반환.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return fList;
	}
	//이름으로검색
	public Friend selectOne(String name) {
		sql = "select * from friend where name=?";
		Friend f = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			
			rs = psmt.executeQuery();
			if (rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return f;
	}
	//전화번호로검색
	public Friend selectTel(String tel) {
		sql = "select * from friend where tel=?";
		Friend f = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tel);
			
			rs = psmt.executeQuery();
			if (rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
