package exam;

import java.util.Scanner;

public class assignment0113 {

 

	public static void main(String[] args) {

//		문제1 각각변수에 대입하여 출력하시오

 

//		   조건1) data는 김개발, 개발부, 대리, 3000000로 대입

//		          변수명은 각각  name,department,position,sal로 할것

//		   조건2)출력은 아래와 같은 메서드(함수)를 이용하시오

//

//		--출력--

//		이름 : 김개발      ---> println

//		부서 : 개발부     ---> printf  

//		직위 : 대리       ---> print 1번만써서 직위,급여출력

//		급여 : 3000000원

 

//		Scanner sc = new Scanner(System.in);

//		

//		String name, department, position;

//		int sal = 0;

//	

//		System.out.println("이름을 입력해 주세요.");

//		name = sc.next();

//		

//		System.out.println("팀명을 입력해 주세요.");

//		department = sc.next();

//		

//		System.out.println("직분을 입력해 주세요.");

//		position = sc.next();

//		

//		System.out.println("월급을 입력해 주세요.");

//		sal = sc.nextInt();

//		

//		System.out.println("이름 : " + name);

//		System.out.printf("부서 : %s%n", department);

//		System.out.print("직위 : " + position + "\n급여 : " + sal);

 

 

 

//		문제 2

 

//		두개의수를 입력받고 둘중 큰수를 출력해보세요

//		ex) 첫번째수가 5 두번째수가 7이 입력이되면

//		      실행결과로

//		      더 큰수 : 7

 

//		Scanner sc = new Scanner(System.in);

//		

//		System.out.println("첫번째 수를 입력해주세요.");

//		int a = sc.nextInt();

//		System.out.println("두번째 수를 입력해주세요.");

//		int b = sc.nextInt();

//		

//		if( a>b ) {

//			System.out.println("더 큰수 : " + a );

//		} else {

//			System.out.println("더 큰수 : " + b );

//		}

 

 

 

//		문제3 

 

//		53130원을 만들기 위한 화폐의 갯수를 구하시오.

 

//		money = 53130원

//		만원 = 5

//		천원 = 3

//		백원 = 1

//		십원 = 3

		

//		int money = 53130;

//		

//		System.out.println("만원 : " + money/10000);

//		System.out.println("천원 : " + (money/1000)%10);

//		System.out.println("백원 : " + (money/100)%10);

//		System.out.println("십원 : " + (money/10)%10);

		

		

		

		

		

//		문제4 

//		입력된 문자가 대문자이면 소문자로 출력하고

//		소문자이면 대문자로 변환하여 출력하시오

//		그외의 문자이면 "입력데이타오류"라고 표시하시오

		

//		String text = "Hello World";

//		

//		System.out.println(text.toUpperCase());

//		System.out.println(text.toLowerCase());

 

 

//		문제5

//		일주일중 좋아하는 날짜를 입력받고

//		날짜별로 다음의 메세지를 출력하세요

//

//		월요일~목요일 : 당신은 일 중독자?

//		금요일 : 불금이 최고입니다 ㅋㅋ

//		토요일~ 일요일 : 인정합니다 ㅋㅋ

//

//		ex) 당신이 좋아하는 날짜를 입력해주세요 -> 목요일 입력

//		      -> 출력결과 : 당신은 일 중독자?

 

//		Scanner sc = new Scanner(System.in);

//

//

//

//		System.out.println("당신이 좋아하는 요일 입력해주세요.");

//		String day = sc.next();

//		

//		switch (day) {

//			case "월요일" : System.out.println("당신은 일 중독자?");

//				break;

//			case "화요일" : System.out.println("당신은 일 중독자?");

//				break;

//			case "수요일" : System.out.println("당신은 일 중독자?");

//				break;

//			case "목요일" : System.out.println("당신은 일 중독자?");

//				break;

//			case "금요일" : System.out.println("불금이 최고입니다.");

//				break;

//			case "토요일" : System.out.println("인정합니다.");

//				break;	

//			case "일요일" : System.out.println("인정합니다.");

//				break;

//			default: System.out.println("올바른 요일을 입력해주세요.");

//				break;

//		}

		

//		문제6

		

//		4개의 값을 콘솔에서 입력받아 처리하시오

//		        조건) 성별 : M 이면 "남자", 나머지 "여자" 

//		             (삼항연산자 이용)

//

//		Input name: 김연경

//		Input gender: F

//		Input age:  35

//		Input tall: 192.3 

//

//		--결과--

//		이름 : 김연경

//		성별 : 여자 

//		나이 : 35세

//		신장 : 192.3cm  

		

		Scanner sc = new Scanner(System.in);

		

		System.out.println("이름을 입력해주세요.");
		String name = sc.next();

	

		System.out.println("성별을 입력해주세요. (m/f)");
		String gender = sc.next();
		

		char g = gender.charAt(0);
		

		gender = ( g == 'm') ? "남자" :  "여자" ;
	

		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();

		

		System.out.println("신장을 입력해주세요.");
		Double tall = sc.nextDouble();

		

		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);

		

		

		

//		문제6

//		1~100사이의수 중에서  3의 배수이면서 7의 배수 구하기 

//		      조건) for문과 && 연산자를 반드시 이용

		

//		for(int i = 1 ; i < 101 ; i++) {

//			if( i%3 == 0 && i%7 == 0 ) {

//				System.out.println("결과 값 : " + i);

//			}

//		}

		

		

		

		

//		문제7

//		[이 문제는 다음주 월요일까지 풀어보세요]

//		 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램을 작성하세요

//		     난수발생) 1. int a=(int)(Math.random()*100) : 0 - 99 사이의 난수

//		                   2. ① import java.util.Random;

//		                      ② Random 변수1 = new Random();

//		                      ③ int 변수2 = 변수1.nextInt(최대값); 

//		                               ==>  0 ~ (최대값 - 1)사이의 임의의 수

//

//		[실행결과]

//

//		*** 난수가 발생하였습니다...맞추어 보세요...*** 

//

//		숫자 입력 : 50

//		컴퓨터의 숫자가 더 큽니다..

//

//		숫자 입력 : 90

//		컴퓨터의 숫자가 더 작습니다..

//

//		          :

//

//		숫자 입력 : 83

//		추카추카...xx번만에 맞추셨습니다...

		

//		Scanner sc = new Scanner(System.in);

//		

//		int a = (int)(Math.random()*100);

//		int num = 0;

//		

//		System.out.println("*** 난수가 발생하였습니다...맞추어 보세요...*** ");

//		while(true) {

//			int i = sc.nextInt();	

//			num++;

//			if( i > a ) {

//				System.out.println("숫자 입력 : " + i);

//				System.out.println("컴퓨터의 숫자가 더 큽니다..");

//			} else if ( i < a ) {

//				System.out.println("숫자 입력 : " + i);

//				System.out.println("컴퓨터의 숫자가 더 작습니다..");

//			} else if ( i == a ) {

//				System.out.println("숫자 입력 : " + i);

//				System.out.println("추카추카..."+num+"번만에 맞추셨습니다...");

//				break;

//			} else {

//				System.out.println("잘못된 숫자 입니다.");

//			}

//		}

	}

}