package classExam;

class CarTest {
	//
	String model;
	int speed;

	//생성자
	CarTest (String model) {
		this.model = model;
	}
	
	void setSpeed (int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(50);
	}// run method end
	
}

public class calssKeyword {
		

	public static void main(String[] args) {
		
		CarTest car1 = new CarTest("2021아반떼N");
		CarTest car2 = new CarTest("벤츠 S클래스");
		
		System.out.println(car1.model);
		
		car1.run();
		car2.setSpeed(80);
		
		System.out.println("car1 speed : " + car1.speed);
		System.out.println("car1 speed : " + car2.speed);
		
		// this, static, final, super
		
		// 인스턴스 맴버
		// 객체를 생성한 후에 사용할 수 있는 필드, 메서드
		// 인스턴스 필드와 메서드는 객체에 소속된 맴버이기 때문에
		// 객체(인스턴스) 없이는 사용이 힘들다.
		
		
		// this 
		// 객체별로 인스턴스 맴버에 접근하기위해 사용하는 키워드
		// this -> 참조변수로 인스턴스 자신을 가리킨다.
		// this를 사용할 수 있는것은 인스턴스 맴버뿐이다.
		
		// this는 모든 인스턴스 매서드에 숨겨진 채로 존재.
		// this는 생성자와 메서드의 매개변수 이름이 필드와 동일할때
		// 인스턴스 맴버인 필드임을 명시하고자 할때 사용
		
		// 문제
		// 붕어빵을만드는 FishBreadUp이라는 클래스를 생성해주세요
		// 조건 - 메인클래스 이름(main 메서드가 들어올 함수) = FishName으로 생성해주세요.
		

	}

}
