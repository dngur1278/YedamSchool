package co.memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import co.memo.model.Memo;

public class MemoList implements MemoAccess {

	ArrayList<Memo> memos;
	String path = "d:/temp/memo/memo.txt";

	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if (!scanner.hasNext())
					break;
				String str = scanner.next();
				String[] arr = str.split(",");
				memos.add(new Memo(arr[0], arr[1]));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Memo m : memos) {
				fw.write(String.format("%s,%s\n", m.getDate(), m.getContent()));
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MemoList() {
		memos = new ArrayList<Memo>();
		open();
	}

	@Override
	public void insert(Memo memo) {
		memos.add(memo);
		save();
	}

	@Override
	public void update(Memo memo) {
		for (Memo m : memos) {
			if (m.getDate().equals(memo.getDate())) {
				m.setContent(memo.getContent());
				save();
			}
		}
	}

	@Override
	public void delete(String date) {
		for (Memo m : memos) {
			if (m.getDate().equals(date)) {
				memos.remove(m);
				save();
				break;
			}
		}
	}

	@Override
	public ArrayList<Memo> selectAll() {
		return memos;
	}

	@Override
	public Memo selectDay(String date) {
		try {
			for (Memo m : memos) {
				if (m.getDate().equals(date)) { // contains : 이름 일부 찾을 때, equals : 완전히 일치 할 때
					return m;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Memo selectCon(String content) {
		for (Memo m : memos) {
			if (m.getContent().contains(content)) { // contains : 이름 일부 찾을 때, equals : 완전히 일치 할 때
				return m;
			}
		}
		return null;
	}
}
