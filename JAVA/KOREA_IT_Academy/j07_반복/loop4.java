package j07_반복;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        // 과제
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력 >>> ");
        int dan = sc.nextInt();

//        for(int i = 1; i < 10; i++){
//            System.out.println(dan + " x " + i + " = " + dan * i);
//        }

        for(int i = 0; i < 9; i++){
            System.out.println(dan + " x " + (i + 1) + " = " + dan * (i + 1));
        }
    }
}
