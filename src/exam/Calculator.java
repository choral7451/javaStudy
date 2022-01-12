package exam;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[]args) {
		//계산기 만들기
		//계산기 기능 최소사항
		//1. 최소 2개 이상의 숫자를 입력받을것(2개도 ok)
		//2. 입력받은 2개의 숫자의 사칙연산이 가능해야한다.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("처번째 수 입력");
		int a = in.nextInt();
		
		System.out.println("두번째 수 입력");
		int b = in.nextInt();
		
		System.out.println("계산결과");
		System.out.println("덧셈 : " + (a+b));
		
		// 계산기 기능개조 1(문제)
		// 만약 a가 b보다 작으면 b-a로 진행하세요
		
		int result = (a < b) ? b - a : a - b;
		System.out.println("뺄셈 : "+ result);
		System.out.println("곱셈 : "+ (a*b));

		
		// 계산기 기능개조 2(문제)
		// 만약 a가 b보다 작으면 b/a로 진행하세요
		int result2 = (a < b) ? b/a : a/b;
		System.out.println("나눗셈 : "+ result2);
	}

}
