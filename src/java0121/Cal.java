package java0121;

public class Cal {
    int a;
    int b;

    public Cal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int result(Operator operator) {
        return operator.operator(a, b);
    }
}
