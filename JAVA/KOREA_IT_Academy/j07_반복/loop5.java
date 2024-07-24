package j07_반복;

public class loop5 {
    public static void main(String[] args) {

        // 1부터 5까지 더하는 for문
//        int total = 0;
//        for (int i = 0; i < 5; i++) {
//            total += i + 1;
//        }
//        System.out.println("1부터 5까지의 합 : " + total);

        // 1부터 5까지 더하는 while문
        /*
            형식 :
            while(조건문){
                실행문
            }

            for 문은 한계값을 설정하기 때문에 정확한 횟수의 반복을 요구할 때 사용하는 편
            while 문은 정확한 횟수의 한계는 모르지만 특정한 조건 하에서의 반복을 요구할 때 사용하는 편
         */

        int i = 1;
        int total = 0;
        while(i <= 5){
            total += i++;
        }

        System.out.println("1부터 5까지의 합 : " + total);
    }
}