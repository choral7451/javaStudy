package exam;

import java.util.Arrays;
import java.util.Scanner;

public class quiz0114 {

	public static void main(String[] args) {
//		[문제1] for문을 이용하여 제곱승을 구하시오
//
//		x의 값을 입력하시오 : 3
//		y의 값을 입력하시오 : 3
//		3의 3승은 27
//
//		[문제2] 50개의 난수를 만들어서 다음과 같이 출력하시오
//		       조건1) 0 - 100 사이의 수 일것
//		       조건2) 1줄에 6개씩 표시하시오  
//
//		--출력--
//		12      72      74      0       20      89
//		84      83      53      0       95      53
//		68      55      89      6       20      68
//		17      9       75      56      17      85
//		62      33      7       34      85      28
//		28      55      95      31      69      22
//		30      92      1       16      88      80
//		64      55      71      12      29      72
//		20      41
//		합=2420
		
		
		// 문제 1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("x의 값을 입력하시오");
//		int x = sc.nextInt();
//		int result = 1;
//		
//		System.out.println("y의 값을 입력하시오");
//		int y = sc.nextInt();
//		
//		for(int i = 0 ; i < y ; i++) {
//			result = result*x;
//		}
//		
//		System.out.println(x+"의 "+y+"승 은"+ result+"입니다.");
//		
		// 문제 2
		
		int[][] arr = new int[9][6];
		int sum = 0;
		
		for( int i = 0 ; i < 9 ; i++ ) {
			if( i == 8) {
				for( int j = 0 ; j < 2  ; j++) {
					arr[i][j] = (int)(Math.random()*100);
					sum += arr[i][j];;		
				}
			} else {
				for( int j = 0 ; j < 6  ; j++) {
					arr[i][j] = (int)(Math.random()*100);	
					sum += arr[i][j];
				}
			}		
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("합 = " + sum);
	
	}

}
