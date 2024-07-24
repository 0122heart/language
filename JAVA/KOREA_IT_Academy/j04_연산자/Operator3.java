package j04_연산자;

import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
//        int year; // 변수 선언
//        int year2 = 2024; // 변수 선언 및 초기화
//        year = 2024; // 초기화

        System.out.println("년도를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        boolean result;
        int year = sc.nextInt();
        /*
        year에 특정한 년도를 넣었을 때, 해당 년도가 윤년인지 아닌지를 boolean 타입으로 제출할 수 있도록 프로그램을 작성하시오

        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때,
        또는 400의 배수일 때이다.
         */
        result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println("결과 : " + result);
    }
}
