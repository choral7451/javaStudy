package iterfaceExam;

//implements는 다중상속을 대체할 수 있음
public class Samoyed implements Doggy2 {

    String name;

    public Samoyed(String name) {
        //인터페이스는 super 키워드가 필수가 아니다.
        this.name = name;
    }

    @Override
    public void playing() {
        System.out.println("뛰어노는중");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzZZZZZZ");
    }

    @Override
    public void eat() {
        System.out.println("와구와구");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
