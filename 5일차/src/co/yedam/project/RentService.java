package co.yedam.project;

import java.util.Scanner;

public class RentService implements Service {
	
	Rent[] rents;
	int cnt;
	int maxCnt = 10;
	
	Scanner scanner2 = new Scanner(System.in);
	
	public RentService() {
		rents = new Rent[maxCnt];
	}
	
	// 도서 대여 등록, 반납일은 대여일의 7일 뒤 직접 입력!!
	@Override
	public void input() {
		if(cnt > maxCnt) {
			System.out.println("더 이상 대여할 수 없습니다.");
			return;
		}
		System.out.printf("이름>>>");
		String name = scanner2.next();
		System.out.print("제목>>>");
		String title = scanner2.next();
		System.out.print("반납일>>>");
		String date = scanner2.next();
		rents[cnt++] = new Rent(name, title, date); 
		System.out.println("등록된 건수:" + cnt);
	}
	
	// 대여수정 (날짜)
	@Override
	public void update() {
		System.out.printf("수정할 번호>>>");
		int idx = scanner2.nextInt();
		if(idx-1 >= cnt) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.print("제목>>>");
		String title = scanner2.next();
		rents[idx-1].setTitle(title); 
		System.out.println("수정되었습니다.");
	}
	
	//대야취소
	@Override
	public void delete() {
		System.out.printf("삭제할 번호>>>");
		int idx = scanner2.nextInt();
		if(idx-1 >= cnt) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for(int i=idx; i<cnt; i++) {
			rents[i-1] = rents[i];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	// 전체조회
	@Override
	public void selectAll() {
		System.out.println(String.format("%-10s %-12s %-10s", "대여자", "도서명", "대여일"));
		System.out.println("================================================================");
		for(int i=0; i<cnt; i++) {
			System.out.println(String.format("%-11s %-10s %-10s", rents[i].getName(), rents[i].getTitle(), rents[i].getDate()));
		}
		System.out.println("================================================================");
	}
	
	// 단건조회
	@Override
	public void selectOne() {
		System.out.printf("조회할 번호>>>");
		int idx = scanner2.nextInt();
		if(idx-1 >= cnt) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println(String.format("대여자: %s   도서명: %s  대여일:%s", rents[idx-1].getName(), rents[idx-1].getTitle(), rents[idx-1].getDate()));
		
	}

}
