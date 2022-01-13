package exam;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class codingTest {
	
	public static void main(String[]args){
		
		
		/*
		 * 숫자가 주어졌을 때(0포함) 숫자들을 이어 붙여 만들 수 있는 가장 큰 수를 찾는 문제입니다.
		 * 
		 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중
		 * 가장 큰 수는 6210입니다.
		 * 
		 * 0 또는 양의 정수가 담긴 배열 find_biggest_num이 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를
		 * 문자열로 바꾸어 return 하도록 find_biggest 함수를 작성해주세요.
		 * 
		 * 제한 사항 find_biggest_num의 길이는 1 이상 1000 이하입니다. find_biggest_num의 요소는 0 이상 1000
		 * 이하입니다. 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다. 입출력 예 numbers return [6, 10, 2]
		 * "6210" [3, 30, 34, 5, 9] "9534330"
		 */
				
		String numbers = "182";
		List<Integer> solution = new ArrayList<>();
		
		int a = Integer.parseInt(numbers);
		int size = 0;
		int result = 0;
		int k = 2;
		
		for(int i = 0 ; i < 8 ; i++) {
			if( a/10 > 0 ) {
				a = a/10;
				size++;
			}
		}
		
		int d = Integer.parseInt(numbers);
		
		for (int i = 0 ; i <= size ; i++ ) {
			solution.add(d%10);
			d = d/10;
		}

		Collections.shuffle(solution);
		
		System.out.println(solution);
		
		for(int i = 0 ; i < size ; i++) {
			for( int j = 0 ; j <= solution.get(i) ; j++ ) {
				if (solution.get(i)/k == 0) {
					result++;
				}
				k++;
			}
			
			
		}
		
		System.out.println(result);
		
	}
}
