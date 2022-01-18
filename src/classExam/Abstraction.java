package classExam;

// 사람이 테이블에 앉아 밥을먹는것을 코드로
//public class People {
//
//    private final Table table;
//    private final Spoon sppon;
//    private final Rice rice;
//
//    public People(Table table, Spoon sppon, Rice rice) {
//        this.table = table;
//        this.sppon = sppon;
//        this.rice = rice;
//    }
//
//    public void eat() {
//        table.seat();
//        spoon.take();
//        spoon.scoop(rice);
//        rice.eaten();
//    }
//
//}



public class Abstraction {

    public static void main(String[] args) {
        // 추상화 : 내용보다 핵심적인 개념을 추려내는 것
        // 1. 핵심적인것을 추려낸다.
        // 2. 추려낸것들을 노출시킨다.
        // 3. How보다 what에 포커스를 둔다.
        
        // ex) 밥을 먹는다.
        // 밥얼 먹는다 라는 행동에 숨겨진 행동들
        // - 식탁에 앉기(무슨식탁이지?)
        // 플라스틱 식탁? , 철식탁?, 나무식탁?
        // - 숟가락 들기(무슨 숫가락이지?)
        //  금수저? 은수저? 플라스틱?
        // - 밥푸기 (무슨밥이지?)
        //  쌀밥? 흑미밥?
        // - 밥을 입으로 가져가기
    }
}
