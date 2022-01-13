package exam;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문
		
		// 1. while 문
		//     - 특정한 조건을 만족할때까지 계속해서 주어진 명령문을 반복 실행.
		
//			int a = 0;
//			while(a<10) {
//				a++;
//				System.out.printf("나는 계속 실행중이야");
//				System.out.println();
//			}  
		// while문의 응용
		// 가게의 하루장사!(커피 타이쿤)
		// 하루의 커피수량을 5개로 가정하고
		// 만약 커피가 다 팔리면 프로그램 종료.
		// 커피가 다 팔았을때 그날의 최종 정산 결과를 출력.
			
//			Scanner sc = new Scanner(System.in);
//			
//			int coffee = 5;
//			int money = 0;
//			int result = 0;
//			
//			
//			
//			while(coffee > 0) {
//				System.out.println("손님이 왔습니다. 커피를 얼마에 파시겠습니까?");
//				money = sc.nextInt();
//				result += money;
//				coffee--;
//				System.out.println("남은 커피: " + coffee + "잔");
//				System.out.println("합계 : " + result);
//			}
//			
//			System.out.println("정산: " + result);
			
//			문제) 점수를 입력받아 80점 이상이면 합격메시지를
//				그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가
//				0에서 100점 이외의 점수가 입력되면 종료하는 프로그램을 작성해보세요.
			
			
			Scanner sc = new Scanner(System.in);
			
			int score = 0;
			
			while(true) {
				System.out.println("점수를 기입해주세요.");
				score = sc.nextInt();
				
				if( score >= 80 ) {
					System.out.println(score+"점 합격");
				} else if( score < 80 && score > 0) {
					System.out.println(score+"점 불합격");
				} else {
					System.out.println("올바른 점수가 아닙니다.");
					break;
				}
			}
			
			
		// 2. do/while 문
		// 3. for문
		// 4. Enhanced for문
	}

}
