package wrapper;

import java.util.ArrayList;

// 1. 기본 데이터형을 객체화 함
// 2. 타입변환
public class WrapperTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(100);		//Integer객체로 박싱
		
		Integer a = 100;
		int b = a.intValue();	//언박싱
		b = a;					//오토언박싱
		
		String s = Integer.toString(a);
		
	}
}
