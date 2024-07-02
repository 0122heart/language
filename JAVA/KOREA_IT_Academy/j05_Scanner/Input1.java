package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        /*
        문자열 입력
        next() : 띄어 쓰기 포함 x
        nextLine() : 띄어 쓰기 포함 o

         */
        String name = "박의진";

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요. ");
        String s = scanner.nextLine();
        System.out.println("주소를 입력하세요. ");
        String s2 = scanner.nextLine();
        System.out.println("나이를 입력하세요. ");
        int i = scanner.nextInt();

        System.out.println("이름 : " + s);
        System.out.println("주소 : " + s2);
        System.out.println("나이 : " + i);

    }
}
