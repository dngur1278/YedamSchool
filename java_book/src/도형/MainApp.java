package 도형;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * Shape s = new Rect(4, 5); 
		 * s.area(); 
		 * s.print();
		 
		 * s = new Tri(4,5); 
		 * s.area(); 
		 * s.print();
		 */
		
		Drawable[] s = new Drawable[3];
		s[0] = new Rect(4,5);		// 자식타입이 부모타입으로 자동 형변환
		s[1] = new Circle(5);		// 부모타입보다 자식타입이 더 크다(자식+부모 > 부모)
		s[2] = new Tri(4,5);
		
		for (Drawable temp : s) {
			temp.draw();
//			if (temp instanceof Rect) {
//				((Rect)temp).area();		// 부모타입을 자식타입으로 강제형변환
//				((Rect)temp).print();
//			} else if (temp instanceof Circle) {
//				((Circle)temp).area();
//				((Circle)temp).print();
//			}else if (temp instanceof Tri) {
//				((Tri)temp).area();
//				((Tri)temp).print();
//			}
			if (temp instanceof Shape) {	// 위의 주석과 같은 방법
				((Shape)temp).area();
				((Shape)temp).print();
			}
			
			if (temp instanceof Movable) {
				((Movable)temp).move();
			}
		}	
	}

}
