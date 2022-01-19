package java0119.exception;

public class ExceptionTest {
    String name;

    public void setName(String name) {
//        if ( name == null ) {
           throw new CustomException();
//        }
    }
}
