package 열거타입;

public enum MENU {
	
	등록(1), 수정(2), 삭제(3), 조회(4), 종료(0);
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	private MENU(int value){
		this.value = value;
	}
	
	public static void print() {
		MENU[] arr = MENU.values();
		for (MENU m : arr) {
			System.out.println(m.value + ":" + m);
		}
	}
	
	public static MENU getMenu(int v) {
		MENU[] arr = MENU.values();
		for (MENU m : arr) {
			if(m.getValue() == v) {
				return m;
			}
		}
		return null;
		
//		switch (v) {
//		case 1 : v = MENU.등록;
//		case 2 : v = MENU.수정;
//		case 3 : v = MENU.삭제;
//		case 0 : v = MENU.종료;
//		}
		
	}
}
