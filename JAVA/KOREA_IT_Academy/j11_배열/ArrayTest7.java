package j11_배열;

public class ArrayTest7 {
    public static void main(String[] args) {
        /*
        { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } }

        을 보기가 힘드니까 사람들이 행렬의 형태로 가르치는 편

        { { 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0 }, }

         */

        int[][] arr = new int[5][5];

        int count = 1;

        // 1부터 25까지 차례대로 배열에 값을 넣는 법
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = count++;
            }
        }

        // 방금 집어넣은 데이터 값을 출력할 때
        /*
            1 2 3 4 5
            6 7 8 9 10
            11 12 13 14 15
            16 17 18 19 20
            21 22 23 24 25

            형태로 출력해보시오.
         */

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
