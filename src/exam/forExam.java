package exam;

import java.util.Scanner;

public class forExam {

	public static void main(String[] args) {
		// for + 배열 -> 숫자 입력받아서 출력하기
		// 	1. 배열의 크기를 사용자에게 입력
		//	2. 배열의 크기만큼 숫자를 배열에 삽입
		//  3. 배열에 들어있는 숫자를 검색
		//
		//	필요한 변수
		// 	1. 입력받을 숫자의 개수 변수
			int count = 0;
		
		//	2. 입력받을 배열
			int[] num;
		
		// 	3. 검색할 숫자 
			int findNum = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("입력할 숫자의 개수 ? : ");
			count = sc.nextInt();
			num = new int[count];
			
			System.out.println(count+"개 만큼 입력해주세요.");
			for( int i = 0 ; i < num.length ; i++ ) {
				num[i] = sc.nextInt();
			}
			
			boolean chk = false;
			
			System.out.println("검색할 숫자 ? : ");
			findNum = sc.nextInt();
			for(int i = 0 ; i < num.length; i++) {
				if(findNum == num[i]) {
					chk = true;
					System.out.println(findNum+"의 위치는" + i + "번째 입니다.");
				}
			}
			
			if(!chk) {
				System.out.println(findNum+"는 존재하지 않습니다.");
			}
		
		
	}

}
