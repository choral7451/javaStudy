package firstTest;
class sumMaker {
    int sum  (int a, int b) {
        int c;
        int result = 0;

        if ( a > b ) {
            while(true) {
                if(a>=b) {
                    result += b;
                    b++;
                } else {
                    return result;
              }
            }
        } else if ( b > a ) {
            while(true) {
                if(a <= b) {
                    result += a;
                    a++;
                } else {
                    return result;
                }
            }
        } else {
            result = a;
            return result;
        }
    }
}
public class java_quiz2_임성준 {
    public static void main(String[] args) {
        sumMaker sum1 = new sumMaker();

        System.out.println(sum1.sum(2,2));

    }
}
