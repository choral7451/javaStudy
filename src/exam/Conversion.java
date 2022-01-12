package exam;

public class Conversion {

	public static void main(String[] args) {
		// 컨버전(형변환)
		// 서로 다른 자료형간 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
		
		// 묵시적 형 변환(자동 형 변환)
		// 
		
		// 명시적 형 변환(강제 형 변환)
		String num = "1234";
		int test = Integer.parseInt(num);
		System.out.println(test);
		
		int a = 10;
		int b = 20;
//		System.out.println(test1+(int)(a+b));
		
		// 정수형 데이터를 문자형으로 바꾸기
		
		// 실수형 / 최근 실수타입의 변수를 사용할때는 float 보다 double을 많이 사용
		
		float c = 123.45f;
		System.out.println(c);
		
		double d = 123.34;
		System.out.println(d);
		
		
		// double로의 명시적 타입 변환
		int testDb = 11;
		int testDb2 = 3;
		
		
		// 실행결과 3.0 : 이유 - java에서 int형 끼리의 결과값은 언제나 int형으로 출력
		double result2 = (double) testDb / testDb2;
		System.out.println(result2);
		
	}
}
