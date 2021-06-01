package 도형;

public class AppMain2 {
	
	public static void main(String[] args) {
		Shape s = new Rect(4,5);	//부모타입 자식객체 참조가능
		execute(s);
		
		Shape s2 = new Circle(4);
		execute(s2);
	}
	
	public static void execute(Shape s) {
		if (s instanceof Drawable) {
			((Drawable)s).draw();		// 다형성: 참조대상의 메서드호출
		} else if (s instanceof Rect) {
			((Movable)s).move();
		} else {
			s.area();
			s.print();
		}
	}
	
//	public static void execute(Shape s) {
//		s.area();
//		s.print();
//	}
}
