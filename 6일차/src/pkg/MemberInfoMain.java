package pkg;

public class MemberInfoMain {
	// 싱글톤 279p
	public static void main(String[] args) {
		MemberInfo member1 = MemberInfo.getInstance();//new MemberInfo();
		member1.names[0] = "홍길동";
		
		MemberInfo member2 = MemberInfo.getInstance();
		member2.names[1] = "김기자";
		
		MemberInfo member3 = MemberInfo.getInstance();
		member3.names[2] = "이기자";
		
		member1.print();
		member2.print();
		member3.print();
		
	}

}
