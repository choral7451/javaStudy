package java0119.enumAndSingleTon;

import java0119.Configuration;

public class EnumAndSingleTon {

    public static void main(String[] args) {

        // enum : 의미있는 상수를 정의하고 프로그램의 안정성을 위해 사용되는
        //        singleton 의 일종.
        // singleton : 인스턴스 생성 패턴중 하나,
        //             인스턴스를 한번 생성하고 인스턴의 내용을
        //             여러 메서드에서 궁유하여 사용하는 패턴



        // 뷔페에가서 원하는 음식을 선택하는 프로그램
        // 음식별로 코드를 부여하고
        // 해당 코드를 선택시 음식을 가져오도록

//        int choice;
//
    // 메서드를 호출해서 결과를 출력하는 부분은 문제가 X
    // but 정수로된 모든 인수를 전달받을 수 있어서 음수를 집어넣으면
    // 문제점이 발생할 수 있다.
        Person person = new Person();
//        person.choice(FoodCategory.PIZZA);

        // 상수관련 메서드
        // name : enum 상수에 정의된 이름을 리턴.

//        System.out.println(FoodCategory.HAMBURGER.name());

        // ordinal : enum 상수에 정으된 순서값 리턴

//        System.out.println(FoodCategory.PIZZA.ordinal());

        System.out.println(FoodCategory.CHICKEN.price);
        System.out.println(FoodCategory.CHICKEN.name);

        // enum 의 생성자는 기본적으로 private 이다.

        // 싱글톤 패턴으로 작성된 클래스에서 인스턴스 생성하기.

        // when? 생성되는 인스턴스들이 동일한  참조 값을 리턴하기때문에
        //      메모리 공간을 절얄할 수 있다.

        // 인스턴스 변수를 선언하여 사용하거나 메서드를 정의해 일반적인 클래스처럼
        // 사용할 수 있다.
        Configuration con1 = Configuration.getInstance();
        Configuration con2 = Configuration.getInstance();

        // 인스턴스를 생성 후 값을 공유한다면
        // 정적 변수와 정적 메서드로 만들어도 상관없음.
        System.out.println(con1.getTestName());
        System.out.println(con2.getTest2Name());
    }

}
