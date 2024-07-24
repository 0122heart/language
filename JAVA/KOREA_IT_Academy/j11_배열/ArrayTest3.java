package j11_배열;

public class ArrayTest3 {
    public static void main(String[] args) {

        /*
            Math.random 메소드
            Java에서 난수를 생성하기 위해 Math.random() 메서드를 사용할 수 있음.
            0.0 ~ 1.0 미만의 난수를 반환

            배열에 임으의 int 값들을 저장할 수 있음.

            1. 10개짜리 배열을 만들고 Math.random()을 이용해 값을 집어넣을 것.
            1-2. 값이 입력된 배열을 출력할 것
            2. 해당 배열의 합을 구할 것.
            3. 짝수만 추출해서 합을 구할 것.
         */

//        double randNum = (Math.random() * 10) + 1;
//        int randInt = (int) randNum;
//        System.out.println(randInt);

        int[] numbers = new int[10];

        // 1. Math.random()을 이용해 값을 집어넣기
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 10 + 1);
        }

        int sum = 0;
        int sumOfEven = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.println((i + 1) + "번째 값은 " + numbers[i] + "입니다.");
            sum += numbers[i];
            if(numbers[i] % 2 == 0){
                sumOfEven += numbers[i];
            }
        }

        System.out.println("배열의 모든 값의 합은 " + sum + "입니다.");
        System.out.println("배열의 모든 짝수의 합은 " + sumOfEven + "입니다.");

        int[] numbers2 = new int[10];
        int sum2 = 0;
        int sumOfEven2 = 0;
        for(int i = 0; i < numbers2.length; i++){
            numbers2[i] = (int) (Math.random() * 10 + 1);
            System.out.println((i + 1) + "번째 값은 " + numbers[i] + "입니다.");
            sum2 += numbers2[i];
            if(numbers2[i] % 2 == 0){
                sumOfEven2 += numbers2[i];
            }
        }
        System.out.println("배열의 모든 값의 합은 " + sum2 + "입니다.");
        System.out.println("배열의 모든 짝수의 합은 " + sumOfEven2 + "입니다.");
    }

}
