package NewCar.CarContents;

public class Engine {
    String name;

    // 시동이 걸렸는지 유무를 체크하는 필드 생성
    boolean inStarted = false;

    Engine(String carName) {
        this.name = carName;
    }
    
    // 시동걸기
    // isStarted 필드를 이용
    //
    void start() {
        if(inStarted) {
            System.out.println(String.format("%는 이미 시동이 걸려있음", name));
        } else {
            inStarted = true;
            System.out.println("부릉부릉!");
        }
    }

    // 멈추기,
    void off() {
        if(!inStarted) {
            System.out.println(String.format("%는 이미 시동이 꺼져있음", name));
        } else {
            inStarted = false;
            System.out.println("시동 off");
        }
    }

    // 시동끄기,
}

