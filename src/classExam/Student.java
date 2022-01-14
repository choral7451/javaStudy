package classExam;


class Test { // class 개체를 찍내기위한 틀 
	// 객체의 속성(멤버 변수)
	public String stuName;
	public int stuID;
	
	
	
	// 객체의 기능(메서드)
	// 1. 학생의 정보를 보는 메서드
	
	public void showStudentInfo() {
		
		//변수명(함수명) 사용시의 표기법 
		// 1. PascalCase(파스칼 표기법)
		//    - 단어사이사이 마다 대문자로 표기함으로써 단어를 구분
		//
		// 2. camelCase(카멜 표기법)
		//    - 첫글자 제외 단어 사이사이 마다 대문자로 표기함으로써 단어를 구분
		//
		// 3. snake_case(스네이크표기법(언더바/언더스코어 표기법))	
		//    - 단어 사이사이마다 _로 표기함으로써 단어를 구분
		
		System.out.println( stuName + stuID);
	}
}

public class Student {

		public static void main(String[] args) {
			
			// 위에서 생성한 Test클래스의 개체를 생성
			// 인스턴스 : 클래스를 통해 생성된 객체 
			
			Test stuLee = new Test();
			// 인스턴스 stuLee의 멤버변수 stuName에 "임성준" 속성부여
			stuLee.stuName = "임성준";
			stuLee.stuID =  001;
			
			// stuLee 인스턴스의 showStudentInfo 메서드 호출
			stuLee.showStudentInfo();
			
			Test stu002 = new Test();
			
			stu002.stuName = "임혜민";
			stu002.stuID = 002;
			
			stu002.showStudentInfo();
			
			System.out.println(stuLee);
			System.out.println(stu002);
			

		}
}
