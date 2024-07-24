package j19_컬렉션;

import java.util.*;

public class StringSet {
    public static void main(String[] args) {
        // HashSet 생성 및 초기화
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        // Set 데이터 삽입
        strSet.add("Java");
        strSet.add("Java");
        strSet.add("Java");
        strSet.add("Python");
        strSet.add("Python");
        strSet.add("Python");
        strSet.add("1");
        strSet.add("2");
        strSet.add("2");
        strSet.add("3");
        strSet.add("3");
        System.out.println(strSet);

        // HashSet을 리스트로 변환 및 정렬 -> 중복 제거 및 정렬을 이유로 Set->List 혹은 List->Set으로의 변환이 잦습니다.
        strList.addAll(strSet);
        Collections.sort(strList);
        System.out.println(strList);
    }
}
