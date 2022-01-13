package exam;

public class DoWhile {

	public static void main(String[] args) {
		// do / while 
		// while문은 루프 진입전 조건식을 먼저 검사
		// do/while은 루프를 먼저 실행하고 조건을 검사
		
//		do {
//			조건식 결과가 참인동안 반복적으로 실행하는 명령문;
//		} while (조건식);
		
		int a=1;
		do {
			System.out.println("나는 멈추지 않은 8비트 트럭" + a);
			a++;
		} while (a<2);
	}
}
