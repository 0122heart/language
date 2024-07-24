package tasks;

import java.util.Scanner;

public class BandNameGenerate {
    public static void main(String[] args) {
        /*
            지금 입은 핳의 색깔과 가장 최근에 먹은 메뉴를 더하면 인디 밴드 이름이 된다.

            실행 예시
            지금 입은 하의 색깔은 무엇입니까? >> grey
            가장 최근에 먹은 메뉴는 무엇입니까 >> 간장 라멘

            당신의 밴드 이름은 grey 간장 라멘입니다
         */

        // 프로그램 실행 인사를 출력해주세요
        Scanner sc = new Scanner(System.in);
        AsciiArt asciiArt = new AsciiArt();

        System.out.println("밴드 이름 출력 시스템입니다.");
        asciiArt.printLogo();


        // 지금 입은 하의 색깔을 입력 받아 pantsColor에 저장하세요.
        System.out.printf("지금 입은 하의 색깔을 입력해주세요. >>> ");
        String pantsColor = sc.nextLine();

        // 가장 최근에 먹은 메뉴를 입력 받아 lastFood에 저장하세요.
        System.out.printf("가장 최근에 먹은 메뉴를 입력해주세요. >>> ");
        String lastFood = sc.nextLine();

        // pantsColor와 lastFood를 합쳐 밴드 이름을 출력하세요
        System.out.printf("당신의 밴드 이름은 %s %s입니다.", pantsColor, lastFood);
    }
}
