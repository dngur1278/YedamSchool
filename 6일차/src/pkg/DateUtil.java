package pkg;
/*
 *  정적 메서드 안에서는 정적 필드만 접근할 수 있음
 *  접근 제어자 :  private  >  default  >  protected  >  public
 *  		    클래스 내부   같은 패키지   다른 패키지-상속   다 가능!!!
 */
public class DateUtil {
	// static String date = "20210601";
	public static String curDate() {
		return "20210602";
	}
}
