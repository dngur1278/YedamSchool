package co.yedam.project;

public class Rent {
	
	private String name;
	private String title;
	private String date;
	
	public Rent() {
		this("","","");
	}
	
	public Rent(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public Rent(String name, String title, String date) {
		this.name = name;
		this.title = title;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "이름: " + name + " 제목: " + title + " 대여기간: " + date;
	}
	
	
}
