package j08_메소드;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while(playAgain){
            int numberToGuess = random.nextInt(100) + 1;
            int attemptLeft = 0;

            System.out.print("난이도를 선택하세요 : 1. 쉬움 / 2. 어려움 >>> ");
            int difficulty = scanner.nextInt();

            if(difficulty == 1){
                attemptLeft = 10;
            }
            else if(difficulty == 2){
                attemptLeft = 5;
            }
            else{
                System.out.println("잘못된 선택입니다. 기본적으로 쉬움 모드로 설정됩니다!");
                attemptLeft = 10;
            }

            boolean hasGuessedCorrectly = false;
            System.out.println("1부터 100까지의 숫자 중 하나를 선택했습니다. 맞춰보세요!");

            while(!hasGuessedCorrectly && 0 < attemptLeft){ // 정답을 맞추거나 혹은 기회를 다 소모했을 경우 false로 바뀌어야 함
                System.out.print("남은 시도 횟수 : " + attemptLeft + "번, 숫자를 입력하세요 >>> ");
                int userGuess = scanner.nextInt();
                attemptLeft--; // attemptLeft -= 1; or attempLeft = attemptLeft - 1

                if(userGuess == numberToGuess){
                    System.out.println("정답입니다! 숫자맞추셨습니다.");
                    hasGuessedCorrectly = true;
                }
                else if(userGuess < numberToGuess){
                    System.out.println("UP");
                }
                else{
                    System.out.println("DOWN");
                }
            }

            if(!hasGuessedCorrectly){
                System.out.println("죄송합니다. 모든 시도를 사용하였습니다. 정답은 " + numberToGuess + " 입니다");
            }
            System.out.println("다시 게임을 시작하시겠습니까? (yes/no)");
            scanner.next();
            String playAgainInput = scanner.nextLine();
            if(playAgainInput == "yes" || playAgainInput == "YES" || playAgainInput == "Yes"){
                playAgain = false;
            }
        }
        System.out.println("게임을 플레이 해주셔서 감사합니다! :)");
        scanner.close();
    }
}
