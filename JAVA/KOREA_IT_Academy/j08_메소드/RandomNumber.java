package j08_메소드;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int money = 5000;

        int a = random.nextInt(10) * 1000 + money;
        // 정수값을 임의적으로 생성해주는 method - nextInt
        // 매개변수는 한계값을 갖는다 -> 0, 1, 2, 3, 4 까지 출력 가능
//        int b = scanner.nextInt();
//        System.out.println(a);
//
//        int b = random.nextInt(10) * 1000 + money;
//        System.out.println(b);
//        System.out.println(a);

        for(int i = 0; i < 10; i++){
            int randNum = random.nextInt(100) + 100;
            System.out.println(randNum);
        }
    }
}
