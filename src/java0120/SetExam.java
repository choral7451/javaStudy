package java0120;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        // Set
        // List 와 유사한 형태지만 중복이 허영되지 않고 순서가 유지되지 않는
        // 특징을 가진 인터페이스
        // HashSet
        // 순서가 필요한 경우 LinkedHashSet, SortedSet, TreeSet

        // list 와 마찬가지로 타입선언은 인터페이스 타입으로
        //객체생성은 HashSet 이나 LinkedHashSet 을 사용하는 형태
        // Set<String> s1 = new HashSet<>();
        // Set<String> s2 = Set.of("three", "four");

        LinkedHashSet<String> ls1 = new LinkedHashSet<>();

    }

}
