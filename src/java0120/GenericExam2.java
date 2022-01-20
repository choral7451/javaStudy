package java0120;

import java.util.ArrayList;

class Box<T> {
    T boxItem;
    T[] itemArr;

    ArrayList<T> list1 = new ArrayList<>();

    public T getBoxItem() {
        return boxItem;
    }

    public void setBoxItem(T boxItem) {
        this.boxItem = boxItem;
    }

    void add (T boxItem) {
        list1.add(boxItem);
    }

    ArrayList<T> getList() {
        return list1;
    }
}

class Fruit {

}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}
public class GenericExam2 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>(); // 타입을 일치시켜야 한다.
        appleBox.add(new Apple()); // 타입을 일치시켜야 한다.

        Box<String> b = new Box<>();

        b.setBoxItem("안녕");
        System.out.println(b.getBoxItem());

    }
}
