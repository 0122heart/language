package j06_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        /*
            switch문
            switch(변수){
                case 조건1 :
                    실행문
                    break;
                case 조건2 :
                    실행문
                    break;
                default :
                    실행문
            }

         */

        Scanner sc = new Scanner(System.in);

        String selected = null;

        System.out.println("[  선택 프로그램  ]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
        System.out.println("메뉴를 선택해주세요 >>> ");

        selected = sc.nextLine();

        switch(selected){
            case "a" :
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;
            case "b" :
                System.out.println("메뉴 2을 선택하셨습니다.");
                break;
            case "c" :
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case "d" :
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case "e" :
                System.out.println("메뉴 5을 선택하셨습니다.");
                break;
            default :
                System.out.println("잘못 선택하셨습니다.");
        }
    }
}
