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
		
//		Scanner in = new Scanner(System.in);
//		
//		int tax = 0;
//		
//		System.out.println("재산을 입력해 주세요");
//		int money = in.nextInt();
//		
//		if( money >= 1000000 ) {
//			tax = 100000;
//		} else {
//			tax = 20000;
//		}
//		
//		System.out.println("재산: "+ money);
//		System.out.println("세금: "+ tax);
		
		
//		String stu1 = "대학생";
//		
//		if(stu1 == "고등학생") {
//			System.out.println("청담고등학교로 가고 있습니다.");
//		} 
		
//		여러개의 조건을 가지는 조건문(else if)	
//		나이별 요금계산 프로그램
		
//		코드에서 필요한것들
//		정수형 변수(나이), 요금,
		
//		조건 
//		1. 0-6세 요금을 받지 않는다.
//		2. 7-12세 미취학 아동으로 분류. 요금은 5000원을 받는다.
//		3. 13-19세는 청소년으로 분류 요금은 10000원을 받는다.
//		4. 20세 부터는 성인으로 분류 요금은 15000원을 받는다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int age;
//		int charge;
//		
//		System.out.println("나이를 입력해 주세요");
//		
//		age = sc.nextInt();
//		
//		if( age < 7 ) {
//			System.out.println("요금은 0원 입니다.");
//		} else if ( age < 13 ) {
//			System.out.println("요금은 5,000원 입니다.");
//		} else if ( age < 20 ) {
//			System.out.println("요금은 10,000원 입니다.");
//		} else if ( age >= 20 ) {
//			System.out.println("요금은 15,000원 입니다.");
//		}
		
//		실습문제
//		값을 입력받고 값이  0~100 사이면
//		입력한 값은 '입력받은 값' 입니다.를 출력하시고
//		100보다 큰 경우는 너무 큰 값을 입력하셨습니다. 를 출력
//		0보다 작은 값을 입력했다면 음수는 입력받을 수 없습니다. 를 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		int value;
//		System.out.println("값을 입력해주세요.");
//		value = sc.nextInt();
//		
//		if( value >= 0 && value <= 100 ) {
//			System.out.println("입력한 값: " +value);
//		} else if ( value > 100 ) {
//			System.out.println("너무 큰 값을 입력하셨습니다.");
//		} else if ( value < 0 ) {
//			System.out.println("음수는 입력받을 수 없습니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력해주세요.");
		int price;
		int coke = 1000;
		
		price = sc.nextInt();
		System.out.println("금액 : " + price);
		
		if( price > coke ) {
			System.out.println("남은 잔액은 : " + (price - coke));
		} else if ( price == coke ) {
			System.out.println("잔액이 없습니다.");
		} else if ( price < coke ) {
			System.out.println("잔액이 부족하여 콜라를 뽑을 수 없습니다.");
		}
			
		
	}

}
