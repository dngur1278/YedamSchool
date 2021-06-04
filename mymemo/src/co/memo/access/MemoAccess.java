package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
	//등록
	public void insert(Memo memo);
	
	//수정
	public void update(Memo memo);
	
	//삭제
	public void delete(String date);
	
	//전체조회
	public ArrayList<Memo> selectAll();
	
	//단건조회
	public Memo selectDay(String date);
	
	public Memo selectCon(String content);
	
}
