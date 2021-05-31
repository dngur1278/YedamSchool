package co.yedam.member;

import java.util.Scanner;

public class MemberService {

	Member[] members = new Member[10];
	int cnt = 0;
	
	Scanner sc = new Scanner(System.in);
	
	//회원가입
	void insert(String id, String password, String name, int age) {
		members[cnt] = new Member(id, password, name, age);
		cnt ++;
	}
	
	void insert() {
		System.out.print("ID>>");
		String id = sc.next();
		System.out.print("PW>>");
		String password = sc.next();
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("나이>>");
		int age = sc.nextInt();
		members[cnt] = new Member(id, password, name, age);
		cnt ++;
	}
	
	
	//회원 리스트
	void printList() {
		for(int i = 0; i < cnt; i++) {
			System.out.println(i + " " + members[i]);
		}
	}
	
	//번호로 조회
	void printNum() {
		System.out.print("번호>>");
		int i = sc.nextInt();
		System.out.println(i + " " + members[i]);
	}
	
	//id로 조회
	void printId() {
		System.out.print("ID>>");
		String idok = sc.next();
		for(int i = 0; i < cnt; i++) {
			if(idok.equals(members[i].id)) {
				System.out.println(members[i]);
			}
		}
	}
	
	void printMember() {
		for(int i = 0; i < cnt; i++) {
			System.out.println("이름:" + members[i].name +" ID:"+members[i].id +" 나이:"+members[i].age);
		}
	}
	// 로그인
	boolean login(String id, String password) {
		for(int i=0; i < cnt; i++) {
			if (id.equals(members[i].id) && password.equals(members[i].password)){
				System.out.println("로그인 되었습니다.");
				return true;
			}
		}
		System.out.println("id 또는 비밀번호가 틀렸습니다.");
		return false;
	}
	
	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}
