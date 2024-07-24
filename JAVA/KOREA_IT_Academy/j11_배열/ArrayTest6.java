package j11_배열;

import java.util.Arrays;

public class ArrayTest6 {
    public static void main(String[] args) {
        /*
            다차원 배열(Multi dimensional array) 중 2차원 배열(웬만하면 여기까지만 나옴)
            다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상 2차원 배열 이상을 사용하는 경우는 극히 드물기 때문에 2차원 배열을 기준으로 강의를 진행함

            형식 :
            int[][] arr = new int[크기][크기]  // 2차원 배열 선언 방식 1
            int[][] arr2 = new int[크기][]  // 2차배열 선언 방식 2(행은 크기를 명시하되 열은 크기를 명시하지 않는 방식)
            int[][] arr3 = { {1, 2}, {3, 4}, {5, 6} } // 2차 배열 선언 방식 3
            System.out.println(arr3[0])

            2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 합니다. -> 2번 방식 참조
         */

//        int[][] arr3 = {{1, 2}, {3, 4}, {5, 6}};
//        System.out.println(arr3);
//        System.out.println(arr3[0]); // 이놈도 배열이기 때문에 값을 찾아낼 수 없음
//        System.out.println(arr3[0][0]);

        // 각 행에 대한 열의 크기
        int[][] arr = new int[2][3]; // 2차원 배열 선언 방식 1
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 11;
        arr[1][1] = 12;
        arr[1][2] = 13;

        // 행의 주소 출력
        System.out.println("2차원 배열 : " + arr);
        // 1행이 가진 열에 대한 주소 출력
        System.out.println("2차원 배열 1행 : " + arr[0]);

        // 행의 크기 출력
        System.out.println("행의 크기 : " + arr.length);
        // 각 행의 열 크기 출력
        System.out.println("1행의 크기 : " + arr[0].length);
        System.out.println("2행의 크기 : " + arr[1].length);
        // 1행 1열의 값 출력
        System.out.println("arr[0][0] = " + arr[0][0]);

        // 2차원 배열 전체 출력
        System.out.println(Arrays.toString(arr));

    }
}
