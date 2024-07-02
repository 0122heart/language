package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        /*
            score가 0보다 작거나 100보다 크면 grade는 x
            score -> 90 ~ 100이면 grade = A
            score -> 80 ~ 89이면 grade = B
            score -> 70 ~ 79이면 grade = C
            score -> 60 ~ 69이면 grade = D
            score -> 0 ~ 59이면 grade = F

            입력한 점수는 __이며 학점은 __ 학점입니다.
            e.g.)입력한 점수는 150이며 학점은 X 학점입니다
         */

        int score = 0;
        String grade = null;

        System.out.println("점수를 입력하세요 >>> ");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        if(score < 0 || 100 < score){
            grade = "X";
        }
        else if(90 <= score){
            grade = "A";
        }
        else if(80 <= score){
            grade = "B";
        }
        else if(70 <= score){
            grade = "C";
        }
        else if(60 <= score){
            grade = "D";
        }
        else{
            grade = "F";
        }

        System.out.println("입력한 점수는 " + score + " 이며 학점은 " + grade + " 학점입니다.");
    }
}
