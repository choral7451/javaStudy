package classExam;

class MemberCall {
	int iv = 100; // 인스턴스 변수 선언
	static int  cv = 250; // 클래스 변수 선언
	
	int iv2 = cv; // 클래스 필드의 값을 인스턴스 필드에 삽입
//	static int cv2 = iv; // 클래스 필드에 인스턴스 필드값을 삽입하는것은 불가
	static int cv2 = new MemberCall().iv; //객채 생성 방식으로 우회하는 방식이 존재함.
	
	void instanceMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
}

public class StaticExam {
	public static void main(String[] args) {
		MemberCall me = new MemberCall();
		
		System.out.println(me.cv);
		System.out.println(me.iv);
		System.out.println(me.iv2);
	}	
}
