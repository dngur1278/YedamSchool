package co.memo.view;

import java.util.List;

import co.memo.access.MemoList;
import co.memo.model.Memo;
import co.memo.util.ScannerUtil;

public class MemoCliApp {

	MemoList memoList = new MemoList();
	boolean cnt = true;

	public void start() {
		int num;
		do {
			memoTitle(); // 매뉴 출력
			num = ScannerUtil.readInt("입력>"); // 매뉴 선택
			switch (num) {
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
				findDate();
				break;
			case 6:
				findCon();
				break;
			}
		} while (num != 0);
	}

	public void memoTitle() {
		System.out.println("============      메모관리      ============");
		System.out.println("1.메모등록 | 2.메모수정 | 3.메모삭제 | 4.메모전체조회");
		System.out.println("5.날짜검색 | 6.내용검색 | 0.종료");
		System.out.println("==========================================");
	}

	public void insert() {
		Memo memo = ScannerUtil.readMemo();
		memoList.insert(memo);
	}

	public void update() {
		Memo memo = new Memo();
		memo.setDate(ScannerUtil.readDate("날짜"));
		System.out.println(memo.getContent());
		memo.setContent(ScannerUtil.readStr("내용"));
		memoList.update(memo);
	}

	public void delete() {
		String date = ScannerUtil.readDate("날짜");
		memoList.delete(date);
	}

	public void selectAll() {
		List<Memo> list = memoList.selectAll();
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}

	public void findDate() {
		while (cnt) {
			String date = ScannerUtil.readDate("날짜");
			Memo memo = memoList.selectDay(date);
			if (memo != null) {
				System.out.println(memo.getContent());
				break;
			} else {
				System.out.println("날짜에 맞는 메모 내용이 없습니다.(다시 입력해 주세요)");
				continue;
			}
		}
	}

	public void findCon() {
		String con = ScannerUtil.readStr("내용");
		Memo memo = memoList.selectCon(con);
		System.out.println(memo);
	}

}
