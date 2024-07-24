package j11_배열;

import java.util.Arrays;
import java.util.Random;

public class ArrayTestLotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6]; // 로또 번호는 6개의 숫자로 구성되므로 6칸짜리 배열을 선언

        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        System.out.println("이번 로또 추첨 번호는 다음과 같습니다.");

        for(int i = 0; i < 5; i++){ // 다섯 게임 동안 반복하겠다
            int index = 0;
            while(index < lottoNumbers.length){ // 6개의 번호를 뽑아내겠다
                int number = random.nextInt(45) + 1; // 1부터 45까지의 정수를 임의적으로 생성

                boolean duplicate = false;
                for(int j = 0; j < index; j++){
                    if(lottoNumbers[j] == number){
                        duplicate = true;
                        break;
                    }
                }

                // 중복이 아니면 배열에 추가
                if(duplicate){
                    continue;
                }

                lottoNumbers[index++] = number;
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
