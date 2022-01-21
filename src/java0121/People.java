package java0121;

public abstract class People {
    abstract public void eat();
    abstract public void sleep();

    public static void main(String[] args) {

        // test.testMethod();
        // 익명클래스의 존재이유?
        // 추상클래스와 인터페이스 관리

        People p1 = new People() {
            @Override
            public void eat() {
                System.out.println("으어 졸려");
            }

            @Override
            public void sleep() {
                System.out.println("으어 졸려");
            }
        };

        // Operate 인터페이스를 이용해서람다식 구현
        //
        // 람다 표현식의 사용조건
        // 1. 인터페이스
        // 2. 인터페이스에 하나의 추상 메서드만 선언.
        Operator operator = (a, b) -> {
            return a+b;
        };

        Cal c1 = new Cal(100, 200);

        int result = c1.result((a, b) -> {
            return a+b;
        });

        System.out.println(result);
    }

}
