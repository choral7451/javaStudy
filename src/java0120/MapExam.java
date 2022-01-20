package java0120;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {
        //Map : key, value 형태의 데이터 관리 인터페이스
        // Collection 인터페이스를  상속받지 않고
        // 그 자체로 인터페이스로 여러가지 Map 구현클래스를 가지고 있음.
        // HashMap

        // Map 사요예시
        // 사람의 이름과 생년월일을 입력받는 맵
        Map<String, String> map1 = new HashMap<>();
        // put : 새로운 요소를 추가할 때 사용
        map1.put("루피", "20121015");
        map1.put("뽀로로", "20120114");
        map1.put("남궁민", "19800102");
        map1.put("김현주", "19810509");

        // get : 특정 key 에 해당하는 값을 가져올 때
        // remove :  Map 요소 삭제
//        System.out.println(map1.remove("뽀로로"));
//        System.out.println(map1);
        // entrySet : key 와 value 값 모두를 entry 객체로 반환
        for( Map.Entry<String, String> ent : map1.entrySet()) {
            System.out.printf("%s:%s\n", ent.getKey(), ent.getValue());
        }

        System.out.println("======================================절취선================================");
        System.out.println(map1.values());

//        for(String s : map1.keySet()) {
//            System.out.println(s);
//        }
        // 성적 관리 프로그램 바꾸기
        // 성적목록을 가지는 List 와 학생 이름을 키로하는 Map
        // 성적목록
        List<Integer> result1 = Arrays.asList(80, 90, 55, 60, 75);

        Map<String, List<Integer>> student = new HashMap<>();
        student.put("마동석", result1);

        int total = 0;
        for( int i : student.get("마동석") ) {
            total += i;
        }
        System.out.println("총점 :  " + total);
    }
}
