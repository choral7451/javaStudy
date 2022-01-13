package exam;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch문의 장점
		// 1. 가독성이 if문보다 뛰어나다.
		// 2. 컴파일러 입장에서 최적화가 쉬워서 속도가 빠르다.
		
//		switch(조건값) {
//			case 값1:
//				조건에 맞다면 실행하는 명령문:
//				break;
//			default :
//				조건값이 어디에도 해당하지 않으면 실행하는 명령문;
//				break;
		char c = 'b';
		
		switch(c) {
			case 'i':
				System.out.println("해당 문자는 i입니다.");
			default:
				System.out.println("자음 혹은 대문자입니다.");
				break;
		}
	}

}
