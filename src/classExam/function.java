package classExam;

import java.util.Scanner;

public class function {

	public static void sayHi(String hello) {
		System.out.println(hello);
	}
	
	// 1부터 넘어온 파라미터까의 합을 계산하는 함수.
	// 100 -> 결과값으로 5050;
	
	public static int calSum(int num) {
	
		int sum = 0;
		
		for( int i = 1 ; i <= num ; i++ ) {
			sum += i ;
		}
		
		return  sum;
	}
	
	
	
	public static int hi(int x, int y) {
		
		int result = x*y;
		// return : 함수를 종료하고 어떠한 ㄱ밧을 반환할 때 
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 두수의 합을 구하는 함수.
		// 인수(argument) =
		// 매개변수(parameter) =
		
//		String hello = "안녕하소";
//		
//		sayHi(hello); // 변수 hello는 함수 sayHi로 전달될 인수.
//		sayHi("아 도대체 도저히 모르겠네 ㅠㅠ");
		
//		int result = calSum(10);
//		System.out.println(result);
		
		System.out.println(hi(10, 20));
	}

}
