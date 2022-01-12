package exam;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[]args) {
		//계산기 만들기
		//계산기 기능 최소사항
		//1. 최소 2개 이상의 숫자를 입력받을것(2개도 ok)
		//2. 입력받은 2개의 숫자의 사칙연산이 가능해야한다.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("계산 프로그램 입니다. ");
		System.out.println("첫번째 숫자를 입력해 주세요");
		int num = in.nextInt();
		System.out.println("사칙 연사자를 선택해 주세요( + - * / )");
		String a = in.next();
		System.out.println(a);
		System.out.println("두번째 숫자를 입력해 주세요");
		int num2 = in.nextInt();
		int result;
		String result2 = new String("잘못된 연산자 입니다.");
		
		if( a == "+") {
			result = num + num2;
			System.out.println(result);
		} else if ( a == "-") {
			result = num - num2;
			System.out.println(result);
		} else if ( a == "*") {
			result = num * num2;
			System.out.println(result);
		} else if ( a == "/") {
			result = num / num2;
			System.out.println(result);
		} else {
			System.out.println(result2);
		}
		
		
	}

}
