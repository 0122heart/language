package j11_배열;

public class ArrayTest8 {
    public static void main(String[] args) {
        /*
            int[] scores = new int[크기]
            향상된 for문(enhanced for) 보충
            형식 :
            자료형 변수명 반복가능객체(주로 배열)
            for(int num : scores){
                실행문
            }

            for문을 실행할 때 반복 대상이 있으면 자료형은 반복 대상이 지닌 자료형과 같은 타입으로 지정해야 함.
            즉 배열을 선언할 때 지정한 자료형과 꺼낼 자료형이 일치해야 함.
            반복 대상의 요소를 하나씩 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복함.

         */

        int[] scores = {90, 92, 93};

        int sum = 0;
        int sum2 = 0;
        double avg = 0;
        double avg2 = 0;

        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("sum : " + sum);

        for(int score : scores){
            sum2 += score;
        }
        System.out.println("sum2 : " + sum2);

        avg = (double)sum / 3;
        avg2 = (double)(sum / 3);
        System.out.println("평균 : " + avg);
        System.out.println("평균 : " + avg2);


    }
}
