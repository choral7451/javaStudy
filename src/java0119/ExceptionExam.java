package java0119;

public class ExceptionExam {
    public static void main(String[] args) {
        // 예외 : 프로그램 실행중 발생하는 예기치 못한 상황
        // 자바에서 모든 에러, 예외는 Throwable 클래스를 통해 처리
        // Throwable 클래스를 직접 이용할일은 극히 드물다.

        // 자주볼 수 있는 예외 종류
        // 1. OutOfMemoryError
        // - 자바 가상머신 메모리가 부족하여 인스턴스 할당이 불가능하고
        //   가비지 컬렉터가 메모리를 사용할 수 없을 때 발생

        // Exception
        // 프로그램 실행중 종료될 수 있는 문제와 연관되어 예외처리를 선택적으로
        // 진행하거나 꼭 해야하나는 클래스들의 슈퍼 클래스()
        // Exception에는 Checked Exception과 Unchecked Exception이 있고
        // Checked Exception에서는 반드시 예외처리를 해야 컴파일이 가능하다.

        // Checked Exception - 직접적으로 Exception 클래스를 상속받는 겨우.
        // UnChecked Exception - RuntimeException 클래스를 상속받는 경우

        // Checked Exception - try catch 구문을 사용해서 작성.
        // try {
        //
        // } catch( Exception e ) {
        //
        // }
    }
}
