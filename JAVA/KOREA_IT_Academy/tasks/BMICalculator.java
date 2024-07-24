package tasks;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            BMI = 몸무게(kg) / 키(m)의 제곱
         */

        System.out.print("당신의 키(m)를 입력하세요 >>> ");
        double height = sc.nextDouble();

        System.out.print("당신의 몸무게(kg)를 입력하세요 >>> ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("당신의 BMI는 %.2f 입니다\n", bmi);

        if(bmi < 18.5) {
            System.out.println("저체중입니다");
        }
        else if(18.5 <= bmi && bmi <= 24.9) {
            System.out.println("정상 체중입니다");
        }
        else if(24.9 <= bmi && bmi <= 29.9) {
            System.out.println("과체중입니다");
        }
        else{
            System.out.println("비만입니다");
        }

        /*
            bmi < 18.5 : 저체중입니다
            18.5 <= bmi < 24.9 : 정상 체중입니다
            24.9 <= bmi < 29.9 : 과제중입니다
            30 <= bmi : 비만입니다
         */

        /*
            print() : 문자열을 출력
            println() : 문자열을 출력하고 자동 개행(enter키 포함)
            printf() : 문자열을 지정된 형식에 맞춰서 출력할 수 있도록 하는 메섣. 별개의 형식지정자가 필요.
            형식 :
            System.out.printf(String 형태, args);
            format : 형식 문자열, 출력할 데이터의 형식과 위치를 지정합니다.
            args : 형식 문자열에서 지정된 형식에 맞게 출력할 데이터.
            형식 지정자 :
            %d : 정수
            %f : 실수
            %s : 문자열
            %c : 문자
         */

//        System.out.printf("정수 값 : %d\n", 37);
//        int age = 23;
//        System.out.printf("정수 값 : %d\n", age);
//        double pi = 3.141592;
//        System.out.printf("원주율 : %f", pi);
//        System.out.printf("원주율 : %.2f", pi);


    }
}
