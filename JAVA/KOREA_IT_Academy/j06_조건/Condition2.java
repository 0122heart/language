package j06_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        // if - else if 문
        // 형식
        // if(조건문){
        //  실행문
        // }
        // else if(조건문) {
        // 실행문
        // }
        // else{
        //  실행문
        // }

        Scanner sc = new Scanner(System.in);

        // 상수는 상수라는 것을 명시하기 위해 대문자로 표기
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        int point = 0;
        String rating = null;
        System.out.println("회원 포인트 점수를 입력하세요. >>> ");
        point = sc.nextInt();

        if(VIP_POINT < point) {
            rating = "VIP";
        }
        else if(GOLD_POINT < point) {
            rating = "GOLD";
        }
        else if(SILVER_POINT < point) {
            rating = "SILVER";
        }
        else if(BRONZE_POINT < point) {
            rating = "BRONZE";
        }
        else{
            rating = "GENERAL";
        }

        System.out.println("직원의 등급 : " + rating);
    }
}
