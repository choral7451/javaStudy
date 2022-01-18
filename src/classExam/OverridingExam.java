package classExam;

class Cat {
    String color = "갈색";

    public void sleep () {
        System.out.println("zzzzzzzzZzzzzzz");
    }

    public void bite () {
        System.out.println("쾈");
    }

    public void eat () {
        System.out.println("고양이 사료 먹는중");
    }

}

class Lion extends Cat {
    String color = "검정";
    // cat의 bite 메서드 오버라이딩
    public void bite () {
        System.out.println("사자한테 물림 죽음");
    }
    
    public void eat () {
        System.out.println("사슴잡아먹음 ㅋㅋ");
    }
}

public class OverridingExam {

    public static void main(String[] args) {
        // 오버라이드 -> 우선시하다
        // 부모클래스에 정의된 내용보다 자식클래스에서 정의된 내용을 더 우선시
        // 행위의 내용을 재정의
        
        // 다형성과 오버라이드
        // 오버라이된 메서드가 존재한다면 생성된 인스턴스에 따라 호출되는 내용이 달라진다.
        Cat cunsik = new Lion();
        Lion streetCat = new Lion();
        Cat streetCat2 = new Cat();

        cunsik.eat();
        streetCat.eat();

        // 그렇다면 부모클래스의 메서드를 호출하는 방법은 없는가?
        // super.메서드()

        // 메서드의 오버라딩 -> 필드도 오버라이딩 가능? XXX 필드는 오버라이딩이 가능하지 않다.
        System.out.println(cunsik.color); // 갈색
        System.out.println(streetCat.color); // 검정
        System.out.println(streetCat2.color); // 갈색
        cunsik.eat();

    }

}
