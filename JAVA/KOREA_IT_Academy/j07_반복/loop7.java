package j07_반복;

import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isEmpty = true;

        while(isEmpty){
            System.out.print("숫자를 입력하세요 : ");

            // 선언과 동시에 초기화
            // 선언과 초기화를 따로 할 수도 있음
            int num = sc.nextInt();

            if(num != 0){
                isEmpty = false;
            }
        }
    }
}
