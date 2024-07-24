package j11_배열;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*
            배열의 출력

            전 수업에서 System.out.println(arr)을 출력하면 주소값만 나온다는 사실을 확인할 수 있었습니다.
            그리고 반복문을 통해서 각 인덱스에 저장된 요소(element)를 불러올 수 있지만 배열 전체를 출력하는 방법을 수업하지 않았습니다.

            이번에는 배열을 출력하는 방법을 배울 예정입니다.
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*
            Arrays 클래스의 메소드를 사용할 예정입니다. 메소드를 이용하는 방식은 클래스명.메소드명()이라는 점 기억해두세요
            toString()이라는 메소드는 반복문의 도움 없이 배열을 출력할 수 있으며 이를 String 형태로 불러내줍니다.
         */

        String arrString = Arrays.toString(arr);
        System.out.println(arrString);

        // 다음에 다룰 자료형 Integer
        Integer[] arr2 = {5, 7, 1, 4, 3, 8, 9, 10, 2, 6};
        System.out.println("정렬 전 배열 : " + Arrays.toString(arr2));

        // 오름차순
        Arrays.sort(arr2);
        System.out.println("정렬 후 배열 : " + Arrays.toString(arr2));

        // 내림차순
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println("내림 차순 배열 : " + Arrays.toString(arr2));
    }
}
