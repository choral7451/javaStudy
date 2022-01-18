package classExam;

class Phone {
    String model;
    String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void action() {
        System.out.println("전원켜기");
        System.out.println("벨울리기");
        System.out.println("전화하기");
        System.out.println("전화종료하기");
    }

}

class SmartPhone extends Phone {
    SmartPhone(String model, String color) {
        super(model, color);
    }

    void action2() {
        System.out.println(color+ " " +model+ " " +  "브라우저 실행");
        System.out.println(color+ " " +model + " " + "인터넷 실행");
        System.out.println(color+ " " +model+ " " +  "카카오톡 실행");
    }

}

public class lunchquize0118 {

    public static void main(String[] args) {
        SmartPhone model1 = new SmartPhone("갤럭시", "하얀색");

        model1.action();
        model1.action2();

    }
}
