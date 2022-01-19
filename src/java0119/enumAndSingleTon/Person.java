package java0119.enumAndSingleTon;

public class Person {
    public void choice(FoodCategory food) {
        switch (food) {
            case HAMBURGER :
                System.out.println("햄버거 선택");
                break;
            case PIZZA:
                System.out.println("피자 선택");
                break;
            case CHICKEN:
                System.out.println("치킨 선택");
                break;
        }
    }
}
