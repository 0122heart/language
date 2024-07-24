package j04_연산자;

public class Operator2 {
    public static void main(String[] args) {
        /*
        <<<<<<<<<<<<<<<< 논리 연산자 >>>>>>>>>>>>>>>>

        true(1), false(0)
        boolean

        AND(&&) : 모두 참이어야 참
        OR(||) : 모두 거짓이어야 거짓
        NOT(!) : 부정
         */

        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T X T = " + result1);

        boolean result2 = flag1 && flag2;
        System.out.println("T X F = " + result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F X F = " + result3);

        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);

        System.out.println(); // ln : line

        System.out.print("안녕하세요?");
        System.out.println("제 이름은 박의진입니다");
        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F X T = " + result7); // T + F = T, T X T = T

        boolean result8 = 10 % 3 != 0;
        System.out.println("10 % 3 != 0 => " + result8);

        int year = 2024;
        boolean result9 = year % 2 == 0 && year % 300 != 0 || year % 100 == 0;
        System.out.println(result9);
    }
}
