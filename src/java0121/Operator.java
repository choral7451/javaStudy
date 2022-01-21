package java0121;

public interface Operator {
    int operator(int a, int b);

    default void print() {
        System.out.println("test");
    }
}
