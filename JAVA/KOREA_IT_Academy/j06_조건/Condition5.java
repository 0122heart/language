package j06_조건;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        System.out.println("점수를 입력하세요 >>> ");
        score = sc.nextInt();
//        int changedScore = score / 10;
//        System.out.println(changedScore);

        if(score < 0 || score > 100){
            System.out.println("X");
        }
        else{
            switch(score / 10){
                case 10 :
                case 9 :
                    System.out.println("A 학점");
                    break;
                case 8 :
                    System.out.println("B 학점");
                    break;
                case 7 :
                    System.out.println("C 학점");
                    break;
                case 6 :
                    System.out.println("D 학점");
                    break;
                default :
                    System.out.println("F 학점");
            }
        }
        System.out.println("프로그램 종료!");
    }
}
