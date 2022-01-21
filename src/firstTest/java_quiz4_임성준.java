package firstTest;
class App_By_stack implements Make_Stack {
    String[] arr = {"","","","2","4"};
    int top = 0;
    int count = 0;
    int search = 0;

    @Override
    public int length() {
        for (int i = 0 ; i < this.arr.length ; i++ ) {
            if(!arr[i].equals("")) {
                count++;
            }
        }
        System.out.println("스택에 저정된 개수 : " + count);

        while (true) {
            if (this.arr[top].equals("")) {
                top++;
            } else if(top == arr.length) {
                System.out.println("스택에 저장된 데이터가 없습니다.");
                break;
            } else {
                break;
            }
        }
        return count;
    }

    @Override
    public int capacity() {
        while (true) {
            if (this.arr[top].equals("")) {
                top++;
            } else if(top == arr.length) {
                System.out.println("스택에 저장된 데이터가 없습니다.");
                break;
            } else {
                break;
            }
        }

        System.out.println("스택에 전체 저장 가능한 개수 : "+ this.arr.length);
        while (true) {
            if (this.arr[top].equals("")) {
                top++;
            } else if(top == arr.length) {
                System.out.println("스택에 저장된 데이터가 없습니다.");
            } else {
                break;
            }
        }
        return this.arr.length;
    }

    @Override
    public boolean pop() {
        while (true) {
            if (this.arr[top].equals("")) {
                top++;
            } else if(top == arr.length) {
                System.out.println("스택에 저장된 데이터가 없습니다.");
                break;
            } else {
                break;
            }
        }
        while (true) {
            if(this.arr[search].equals("")) {
                search++;
            } else if ( search == this.arr.length) {
                System.out.println("스택에 저장된 데이터가 없습니다.");
                return false;
            } else if ( !this.arr[search].equals("") ) {
                System.out.println("스택 top에 저장되어있는 실수는 "+arr[search]+" 입나다.");
                return true;
            }
        }

    }

    @Override
    public void push(String text) {
        search = this.arr.length-1;
        top = this.arr.length-1;
        while (true) {
            if(!this.arr[search].equals("")) {
                search--;
                if(search < 0) {
                    search = 0;
                    top = 0;
                    System.out.println("스택에 저장할 공간이 없습니다.");
                    break;
                }
            } else {
                arr[search] = text;
                System.out.println("스택에 저장된 내용은 "+text+ " 입니다.");
                this.top = search;
                break;
            }
        }
    }
}

public class java_quiz4_임성준 {
    public static void main(String[] args) {
        App_By_stack num1 = new App_By_stack();

        num1.push("안녕?");
        num1.push("안녕?");
        num1.capacity();
        num1.pop();


        System.out.println("현재 탑위치 : " + num1.top);
    }
}
