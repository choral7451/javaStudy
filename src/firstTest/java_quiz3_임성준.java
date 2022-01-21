package firstTest;

import java.util.Scanner;

class Proccessor {
    Scanner sc = new Scanner(System.in);
    double area;
    double inputNum1, inputNum2, inputNum3;
    int choice;
    int x = 0;

    final double PI = 3.141592;

    public Proccessor(double area) {
        this.area = area;
    }

    void circle() {
        x=2;
        System.out.println("반지름을 입력해주세요.");
        this.inputNum1 = sc.nextInt();
        this.area = (this.inputNum1*this.inputNum1)*this.PI;
        output();
    }
    void triangle() {
        x=1;
        System.out.println("밑변을 입력해주세요.");
        this.inputNum1 = sc.nextDouble();
        System.out.println("높이를 입력해주세요.");
        this.inputNum2 = sc.nextDouble();
        this.area = (this.inputNum1*this.inputNum2)/2;
        output();
    }
    void trape() {
        x=3;
        System.out.println("윗변을 입력해주세요.");
        this.inputNum1 = sc.nextDouble();
        System.out.println("아랫변를 입력해주세요.");
        this.inputNum2 = sc.nextDouble();
        System.out.println("높이를 입력해주세요.");
        this.inputNum3 = sc.nextDouble();
        this.area = ((this.inputNum1+this.inputNum2)*this.inputNum3)/2;
        output();
    }

    void output() {
        if(x ==1) {
            System.out.println("밑  변 : " + this.inputNum1);
            System.out.println("높  이 : " + this.inputNum2);
            System.out.println("넓  이 : " + this.area);
        } else if ( x == 2 ) {
            System.out.println("**** 원의 넓이 ****");
            System.out.println("반지름 : " + this.inputNum1);
            System.out.println("넓  이 : " + this.area);
        } else if ( x == 3 ) {
            System.out.println("**** 사다리꼴의 넓이 ****");
            System.out.println("윗   변 : " + this.inputNum1);
            System.out.println("아랫 변 : " + this.inputNum2);
            System.out.println("높   이 : " + this.inputNum3);
            System.out.println("넓   이 : " + this.area);
        }
    }
    void Menu() {
        System.out.println("**** 도형선택 ****");
        System.out.println("1. 삼각형");
        System.out.println("2. 원");
        System.out.println("3. 사다리꼴");
        System.out.println("4. 종료");
        System.out.println("번호를 선택해주세요.");
        this.choice = sc.nextInt();
        System.out.println("선택 : " + this.choice);

        if( this.choice == 1) {
            triangle();
        } else if ( this.choice == 2 ) {
            circle();
        } else if ( this.choice == 3 ) {
            trape();
        } else if ( this.choice == 4 ) {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}
public class java_quiz3_임성준 {
    public static void main(String[] args) {
        Proccessor num1 = new Proccessor(0.0);

        num1.Menu();
    }
}
