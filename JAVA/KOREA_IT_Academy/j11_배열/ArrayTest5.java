package j11_배열;

import java.util.Arrays;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*
            while 반복문을 돌려서 5번 로또 번호 추출을 가능하게 할 것
            1 - 45까지의 숫자를 임의로 생성한 후. lottoNumbers 배열에 저장할 것
            로또 번호는 6개
            lottoNumbers 배열이 다섯번 출력되도록 할 것

            실행 예시 :
            로또 번호 추첨기에 오신 것을 환영합니다. 5 게임을 시작합니다.
            이번 로또 당첨 번호는 다음과 같습니다.
            { ... }
            { ... }
            { ... }
            { ... }
            { ... }
         */

        int[] lottoNumbers;
        lottoNumbers = new int[6];
        int i = 0;
        System.out.println("이번주 로또 당첨 번호는 다음과 같습니다.");
        while(i++ < 5){
            for(int j = 0; j < lottoNumbers.length; j++){
                lottoNumbers[j] = (int)(Math.random() * 45 + 1);
            }
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
