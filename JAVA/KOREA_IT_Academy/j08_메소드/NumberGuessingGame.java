package j08_메소드;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true; // 참이냐 거짓이냐!

        while(playAgain){
            // 1 ~ 100의 임의의 정수를 생성
            // 난이도 선택 - scanner.nextInt()를 1 - 쉬움 / 2 - 어려움
            // 쉬움 난이도 임시에
            // 쉬움 난이도 일시에 attemptsLeft = 10
            // 어려움 난이도 일시에 attemptsLeft = 5
            // 1, 2 이외의 다른 숫자 입력시에 "잘못된 선택입니다. 기본적으로 쉬움 모드로 설정됩니다."
            // !의 의미 : 값 반전
            // 게임이 끝났을 때(정답 맞춘 후 혹은 기회 소진 후, " 다시 하시겠습니까? yes/no"로 받아서 재시작 가능하게

            // 정답 생성
            int answer = random.nextInt(100) + 1;
            int userGuess;
            int chance;

            // 코인 생성
            System.out.print("난이도를 선택하세요! 1 - 쉬움 / 2 - 어려움 >>> ");
            int difficulty = scanner.nextInt();
            if(difficulty == 2){
                chance = 5;
            }
            else if(difficulty == 1){
                chance = 10;
            }
            else{
                System.out.println("잘못된 선택입니다. 기본적으로 쉬움 모드로 설정됩니다.");
                chance = 10;
            }
            System.out.println();

            // 게임 시작
            boolean correct = false;
            while(0 < chance && !correct){ // 정답을 맞추거나 혹은 코인을 다 소진했을 경우 루프 탈출
                System.out.println("남은 코인 : " + chance--);
                System.out.print("1부터 100 사이의 숫자를 입력하여 정답을 맞추세요 >>> ");
                userGuess = scanner.nextInt();

                if(userGuess == answer){
                    System.out.println("축하합니다! 정답입니다.");
                    correct = true;
                }
                // 입력한 값이 정답보다 클 때
                else if(answer < userGuess){
                    System.out.println("UP! 입력한 값이 정답보다 큽니다.");
                }
                else{
                    System.out.println("DOWN! 입력한 값이 정답보다 작습니다.");
                }
                System.out.println();
            }

            if(!correct){
                System.out.println("코인을 모두 소진하였습니다.");
                System.out.println("정답은 " + answer + "입니다");
                System.out.println();
            }

            while(true){
                System.out.print("다시 하시겠습니까? yes 혹은 no를 입력하세요 >>> ");
                String isAgain = scanner.next();
                if(isAgain.equalsIgnoreCase("yes")){
                    break;
                }
                else if(isAgain.equalsIgnoreCase("no")){
                    System.out.println("게임이 종료됩니다.");
                    playAgain = false;
                    break;
                }
                else{
                    System.out.println("잘못된 입력입니다. 다시 입력하세요!");
                }
            }
        }
        System.out.println("게임을 플레이 해주셔서 감사합니다! :)");
    }
}
