package classExam;

class OverLoadingTest {
	int add (int a, int b) {
		return a + b;
	}
	long add (long a, long b) {
		return a - b;
	}
	
	
	// 파라미터의 개수와 타입이 다른경우
//	String add (String a, String b, String c) {
//		return a + c;
//	}
}

public class overLoadingExam {

	public static void main(String[] args) {
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 20)+"int");
//		System.out.println(ov.add(10, 20)+"long");
		
		
//		System.out.println(ov.add("10", "20", "30"));
		
	}

}
