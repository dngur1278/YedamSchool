package co.yedam.test;

import java.util.Arrays;

/*
 *  기본 데이터 타입의 기본값은 0으로 초기화
 *  참조변수(String, [])의 초기값은 null
 */
public class FiledInitValue {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	char c;
	String str;
	int[] arr;
	
	@Override
	public String toString() {
		return "FiledInitValue [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", bool="
				+ bool + ", c=" + c + ", str=" + str + ", arr=" + Arrays.toString(arr) + "]";
	}
	
	FiledInitValue() { }
	FiledInitValue(int a, double d2){
		i = a;
		d = d2;
	}
}
