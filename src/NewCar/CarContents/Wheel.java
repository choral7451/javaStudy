package NewCar.CarContents;

public class Wheel {
    // 필드 영역
    String name;

    Wheel (String wheelName) {
        this.name = wheelName;
    }

    // 메서드
    void go() {
        System.out.println(String.format("%s의 바퀴가 굴러가요!", name));
    }
}
