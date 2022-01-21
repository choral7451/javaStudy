package java0121;
class  Test0121 {
    public void testMethod() {
        System.out.println("test");
    }
}
public class LambdaMain {
    public static void main(String[] args) {
        // 익명클래스 : 상속받는 클래스를 명시적으로 별도의 Java 파일을 통해
        //            클래스를 만드는게 아니라 코드 내부에 이림이 존재하지 않는 클래스를 만드는 것.

        // Test0121클래스를 상속받는 익명의 클래스 생성
        Test0121 test = new Test0121() {
            //Test0121 클래스에서 익명의 클래스로 오버라이딩
            public void testMethod() {
                System.out.println("오버라이딩");
            }
            //새로운 메서드 생성
            //외부에서 호출은 불가능
            // 생성된 인스턴스 test 는 Test0121클래스가 아니라
            // Test0121 클래스를 상속받는 익명클래스 이기 때문
            public void serve() {
                System.out.println("서브메서드!");
            }
        };

        test.testMethod();
        // 익명클래스의 존재이유?
        // 추상클래스와 인터페이스 관리
        // -> 내용이 가벼울경우 익명클래스를 이용해서 처리하기도 한다.
    }

}
