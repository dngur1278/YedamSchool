package co.memo.model;

public class Memo {
	private String date;
	private String content;
	
	public Memo() {}
	
	public Memo(String date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "날짜: " + date + " 메모내용: " + content;
	}
	
	
}
