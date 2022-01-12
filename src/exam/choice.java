package exam;

import java.util.Scanner;

public class choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문
		// 프로그램의 순차적인 흐름을 제어하는 방법
		// -> 순차적 흐름을 제어하고 이때 명령문을 통해 제어.
		// 제어 : 조건문, 반목문,
		
		// 제어문에 속하는 명령문들은 중괄호로 둘러쌓여져 있음
		// 중괄호 영역을 블록이라 칭함
		
		// 조건문
		// 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 하는 제어문.
		
		
		// 문제
		// 재산에따라 세금을 부여하는 프로그램을 작성하세요
		// 1. 재산이 100만원 이상이면 세금을 10만원을 납부.
		// 2. 그렇지 않으면 세금을 2만원을 나부.
		
		Scanner in = new Scanner(System.in);
		
		int tax = 0;
		
		System.out.println("재산을 입력해 주세요");
		int money = in.nextInt();
		
		if( money >= 1000000 ) {
			tax = 100000;
		} else {
			tax = 20000;
		}
		
		System.out.println("재산: "+ money);
		System.out.println("세금: "+ tax);
		
	}

}
