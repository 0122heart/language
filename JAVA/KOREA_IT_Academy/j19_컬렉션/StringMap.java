package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {
        // HashMap 생성 및 초기화
        Map<String, String> map = new HashMap<String, String>();

        // Map에 데이터 삽입
        map.put("kor20240000", "박의진");
        map.put("kor20240001", "박으진");
        map.put("kor20240002", "박의지");
        map.put("kor20240003", "박으지");

        // Map 출력
        System.out.println(map);

        // 특정 키의 값 조회
        System.out.println(map.get("kor20240001"));

        // 특정 키의 값 수정 - put을 통한 덮어쓰기
        String searchId = "kor20240001";
        map.put(searchId, "박의진2");
        System.out.println(map);

        // 특정 키의 값 수정 2 - replace() 사용
        map.replace(searchId, "박의진1111");
        System.out.println(map);

        // 특정 키와 값의 존재 여부 확인
        boolean searchSuccessFlag = map.containsKey("kor20240003");
        System.out.println(searchSuccessFlag);

        // 특정 값 존재 여부 확인
        boolean searchSuccessFlag2 = map.containsKey("바그진");
        System.out.println(searchSuccessFlag2);

        // 맵의 엔트리(key-value 쌍)로부터 List 생성
        Set<Map.Entry<String, String>> entry = map.entrySet();
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();
        entries.addAll(entry);

        // 엔트리 리스트 출력
        System.out.println("entry 리스트 : " + entries);

        // 엔트리 반복자 사용

        // 키셋 출력
        Set<String> keySet = map.keySet();
        System.out.println("keySet >>> " + keySet);

        // 값 컬렉션 출력
        Collection<String> values = map.values();
        System.out.println("values >>> " + values);
    }
}
