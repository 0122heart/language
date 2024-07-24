package j19_컬렉션;

/*
    컬렉션(Collection)은 여러 객체를 모아놓은 것을 의미함.
    종류 :

    1. List : 순서가 있는 데이터의 집합으로, 중복된 요소를 허용함.
        - ArrayList : 배열 기반의 리스트, 요소 접근 속도가 빠름.
        - LinkedList : 연결 리스트의 리스트, 삽입 / 삭제 속도가 빠름.
    2. Set : 중복을 허용하지 않는 데이터의 집합.
        - HashSet : 해시 테이블 기반의 집합, 요소의 순서를 보장하지 않음.
        - TreeSet : 이진 검색 트리 기반의 집합, 요소가 정렬된 상태로 유지됨.
    3. Map : 키와 값(Key and Value)의 쌍으로 이루어진 데이터의 집합
        - HashMap : 해시 테이블 기반의 맵, 키의 순서를 보장하지 않음.
        - TreeMap : 이진 검색 트리 기반의 맵, 키가 정렬된 상태로 유지됨.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

    public static void main(String[] args) {
        // ArrayList 생성 및 초기화
        List<String> strList = new ArrayList<String>();

        // List의 데이터 삽입
        strList.add("java");
        strList.add("python");
        strList.add("C#");
        strList.add("JavaScript");
        strList.add("Kotlin");

        // List의 출력
        System.out.println("전체 리스트 : " + strList);

        // 특정 문자열 검색
        String searchStr = "python";
        boolean contains = strList.contains(searchStr);
        System.out.println(searchStr + " 포함 여부 : " + contains);

        // 부분 검색 지원
        String searchStr2 = "pyth";
        boolean contains2 = strList.contains(searchStr);
        System.out.println(searchStr2 + " 포함 여부 : " + contains2);

        // 특정 문자열 삭제
        String removeStr = "C#";
        boolean removed = strList.remove(removeStr);
        System.out.println(removeStr + " 삭제 여부 : " + removed);

        // 삭제 후 리스트
        System.out.println("삭제 후 리스트 : " + strList);
        System.out.println();

        // 부분 문자열로 삭제 불가
        String removeStr2 = "py";
        boolean removed2 = strList.remove(removeStr);
        System.out.println(removeStr2 + " 삭제 여부 : " + removed2);

        // List 정렬
        Collections.sort(strList);
        System.out.println("정렬된 리스트 : " + strList);

        // List 역순 정렬
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("역순 정렬된 리스트 : " + strList);

        System.out.println();
        System.out.println(strList);
        // List의 특정 인덱스 요소 조회
        System.out.println(strList.get(1));
    }

}
