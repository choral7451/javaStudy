package classExam;


class  Dog {
    String color;
    String action;

    public Dog(String color, String action) {
        this.color = color;
        this.action = action;
    }

    void dogData () {
        System.out.println("색 : " + color );
        System.out.println("행동 : " + action);
    }
}

class Beagle extends Dog {
    public Beagle(String color, String action) {
        super(color, action);
    }
}

class GoldenRetriever extends  Dog {
    public GoldenRetriever(String color, String action) {
        super(color, action);
    }

    void swim () {
        System.out.println("GoldenRetriever 수영할 수 있어요!");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        // 객체의 형변환 -> 바꾼 자료형으로 사용하겠다.
        //  - 인스턴스가 변하는 것은 아니다.
//        Dog d1 = new Dog("a","a");
        //아래의 코드는 개는 리트리버다 라고 얘기하는것과 같음
//        GoldenRetriever d2 = (GoldenRetriever)d1;
//      // 비글은 개다 라고 얘기하는것과 같음
        // 객체의 형 변환
//        Dog d1 = new Beagle();
//        Beagle b1 = (Beagle)dd;


        // 다형성
        // 객체지향 언어의 특성중 하나
        // 여러가지 형태에 속할 수 있는 성질이란 뜻으르
        // 하나의 객체 인스턴스가 여러가지 자료형을 가질 수 있는것.

        // 1. 산소는 기체이다
        // 2. 사모에드는 개다
        // 3. 코리안숏헤어는 고양이다.
        // 4. 프로그래밍 언어는 JAVA다. -> X

        // 문제
        // 부모클래스 Dog를 상속받는
        // Beagle 클래스와 GoldenRetriever 클래스를 생성하고
        // 이중GoldenRetriever 클래스는 수영을 할 수 있다 가정하고
        // swim 메서드를 추가하세요

        // Dog 클래스의 기본기능
        // 필드 : 색깔
        // 기본 행동 : 깨물기, 밥먹기, 짓기

        Beagle dog1 = new Beagle("orange", "bite");
        GoldenRetriever dog2 = new GoldenRetriever("pink", "eat");

        dog1.dogData();
        dog2.dogData();

        dog2.swim();

        // instanceof
        // 해당 인스턴스가 특정 클래스의 인스턴스인지 확인하는 연산자.
        // 문법 :
        //  (변수명 or 인스턴스명) instanceof (클래스명)
        Dog dog = new GoldenRetriever("b","b");

        System.out.println(dog instanceof GoldenRetriever);
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Beagle);

    }
}
