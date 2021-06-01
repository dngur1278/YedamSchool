package co.yedam.project;

import java.util.Scanner;

public class MemberService implements Service {
	
	Member[] members;
	int cnt;
	int maxCnt = 10;
	
	Scanner scanner1 = new Scanner(System.in);
	
	public MemberService() {
		members = new Member[maxCnt];
	}
	
	// 회원 등록
	@Override
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.print("이름>>>");
		String name = scanner1.next();
		System.out.print("휴대폰>>>");
		String phone = scanner1.next();
		members[cnt++] = new Member(name, phone);
		System.out.println("등록된 건수:" + cnt);
	}
	
	// 회원 수정(phone번호만 수정)
	@Override
	public void update() {
		System.out.print("수정할 번호>>>");
		int idx = scanner1.nextInt();
		if (idx-1 >= cnt) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.print("휴대폰>>>");
		String phone = scanner1.next();
		members[idx-1].setPhone(phone);
		System.out.println("수정되었습니다.");
	}
	
	// 삭제
	@Override
	public void delete() {
		System.out.printf("삭제할 번호>>>");
		int idx = scanner1.nextInt();
		if(idx-1 >= cnt) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for(int i=idx; i<cnt; i++) {
			members[i-1] = members[i];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	// 전체조회
	@Override
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "이름", "휴대폰"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-20s %-20s", members[i].getName(), members[i].getPhone()));
		}
		System.out.println("================================================================");
	}

	// 단건조회
	@Override
	public void selectOne() {
		System.out.printf("조회할 번호>>>");
		int idx = scanner1.nextInt();
		if(idx-1 >= cnt) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println(String.format("이름: %s   휴대폰: %s", members[idx-1].getName(), members[idx-1].getPhone()));
	}

}
