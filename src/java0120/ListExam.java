package java0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        // list : 중복이 허용되고, 저장순서가 유지되는 구조
        // -> 구현 클래스 : ArrayList, LinkedList
        // add, addAll
        // get() : 지정된 위치에 있는 객체 리턴
        // indexOf() : 객체의 위치 반환
        // lastIndexOf() : List 의 마지막 요소부터 역방으로 위치 리턴
        // listIterator : List 객체에 접근하는 ListIterator 를 리턴
        // remove() : 지정된 위치에있는 객체를 삭제하고 삭제된 객체 자체를 리턴
        // set() : 지정된 위치에 객체를 저장
        // sort() : 지정된 값으로 List 요소 정렬
        // subList() : 지정된  범위에 있는 개체를 새로운 List 로 리턴

        // ArrayList vs LinkedList
        // 공통점
        // 1. 모든 용도에서 사용 가능
        // 2. 사용하는 메서드 동일

        // 차이점
        // 1. 데어터의 추가나 삭제가 빈번한 경우 처리속도 차이가 있음(LinkedList 가  빠름)
        // 2. ArrayList 는 데이터의 변경이 적을때 사용(작업처리 과정 때문)
        //    - ArrayList 는 LinkedList 보다 로딩속도가 빠르기 때문에 search 과정은 ArrayList 가 빠르다
        
        
        // ArrayList 
        List<String> l1 = new ArrayList<>();
        List<String> l2 = Arrays.asList("오", "육", "칠");
        List<String> l3 = List.of("쓰리", "포");

//        l1.addAll(12);
        l1.add("팔");
        System.out.println(l1);
        // LinkedList
        LinkedList<String> Llist1 = new LinkedList<>();

//        Llist1.addAll(12);
        Llist1.add("링크드리스트");
        System.out.println(Llist1);

        //get을 통해 리스트의 위치 가져오기
//        System.out.println(Llist1.get(3));
        // indexOf를 이용해서 요소의 위치 확인
        // 만약 없는 요소면 -1출력
        System.out.println(Llist1.indexOf(2));
        
        // lastIndexOf
        System.out.println(Llist1.lastIndexOf("이"));

        // listIterator : Iterator 인터페이스를 상속받아 기능을 추가


    }
}
