package j19_컬렉션;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {

        // key,, value
        Map<String, String> userMap = new HashMap<String, String>();

        // Map에서 element 추가하는 법 .put(key, value)
        userMap.put("username", "uijin");
        userMap.put("password", "1234");  // 제네릭으로 <String, String>으로 규정했기 때문에 비밀번호가 1234더라도 "1234"로 작성해야함
        userMap.put("email", "0122heart@naver.com");
        userMap.put("name", "박의진");

        Set<String> keySet = userMap.keySet();  // Map의 key 값들을 Set으로 받아옴
        System.out.println("keySet");
        System.out.println(keySet);
        List<String> keyList = new ArrayList<>();  // List를 생성
        keyList.addAll(keySet);  // keySet의 모든 요소들을 keyList에 더함
        System.out.println("keyList");
        System.out.println(keyList);

        String keyName1 = keyList.get(0);
        String keyName2 = keyList.get(1);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(3);

        // Set에는 순서가 없기 때문에 index로 조회 불가능하기 때문에 List로 바꾼 다음 주소지별로 조회
        System.out.println(keyName1);
        System.out.println(keyName2);
        System.out.println(keyName3);
        System.out.println(keyName4);

        // value를 조회하는 방법 - map에서 value를 조회하기 위해서는 인덱스가 아니라 정확한 key값이 있어야함.
        String value1 = userMap.get(keyName1);
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);
        System.out.println("value 조회");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        System.out.println(keyName1 + " >>> " + value1);
        System.out.println(keyName2 + " >>> " + value2);
        System.out.println(keyName3 + " >>> " + value3);
        System.out.println(keyName4 + " >>> " + value4);
    }
}
