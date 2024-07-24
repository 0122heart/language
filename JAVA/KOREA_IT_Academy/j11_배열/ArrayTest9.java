package j11_배열;

import java.util.Arrays;

public class ArrayTest9 {
    public static void main(String[] args) {
        // 2차원 배열의 출력
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 1차원 배열의 출력 방식 toString(배열 이름)
        System.out.println(Arrays.toString(arr));
        
        // 다차원 배열의 출력 방식 deepToString(배열 이름)
        System.out.println(Arrays.deepToString(arr));
    }
}
