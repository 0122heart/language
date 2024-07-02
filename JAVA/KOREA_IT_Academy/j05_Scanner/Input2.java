package j05_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("x 입력 : ");
        int x = scanner.nextInt();

        System.out.println("y 입력 : ");
        int y = scanner.nextInt();

        System.out.println("x + y = " + (x + y));
    }
}
