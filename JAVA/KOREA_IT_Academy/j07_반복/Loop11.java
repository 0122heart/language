package j07_반복;

public class Loop11 {
    public static void main(String[] args) {
        String message = "HelloWorld";
        String name;
        name = "ParkUijin";

        // 향상된 for문
        for(char ch : name.toCharArray()){
            System.out.println(ch);
        }

        System.out.println("---------------------------");
        // 기존 for문
        for(int i = 0; i < message.length(); i++){
            System.out.println(message.charAt(i));
        }
        System.out.println(message.length());

        /*
            향상된 for문(Enhanced for loop)의 정의
            향상된 for문은 배열이나 컬렉션(데이터 모음)을 순회할 때 사용하는 반복문으로, 배열 또는 컬렉션의 각 요소에 순차적으로 접근할 수 있습니다.
            향상된 for문은 반복 인덱스나 조건문 없이 간편하게 요소를 처리할 수 있는 장점을 지니고 있습니다.
         */

        /*
            향상된 for문의 형식
            for(변수 선언 : 배열 or 컬렉션 or 문자열){
                // 반복 실행문
            }
            변수 선언 -> 자료형 변수 이름
         */
    }
}
