package firstTest;

import java.util.Random;
import java.util.Scanner;

public class java_quiz1_임성준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random ran = new Random();
        int num = ran.nextInt(26);
        System.out.println(num);

        System.out.println("난수가 발생하였습니다.");
        while (true) {
            System.out.println("정답을 입력해주세요.");
            int inputNum = sc.nextInt();
            if( inputNum >=0 && inputNum < 26 ) {
                if(num == inputNum) {
                    System.out.println(num + " 정답입니다!");
                    break;
                } else {
                    System.out.println("틀렸습니다.");
                }
            } else {
                System.out.println("0~25까지의 숫자를 입력해주세요.");
            }
        }
    }
}
