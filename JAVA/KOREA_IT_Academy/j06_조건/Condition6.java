package j06_조건;

public class Condition6 {
    public static void main(String[] args) {
        /*
            삼항 연산자
            정의 : 조건식을 평가하여 true 혹은 false 여부에 따라서 두 가지 표현식 중 하나를 선택적으로 실행

            문법 :
            조건식 ? 표현식1 : 표현식2

            조건식 : 참(true) 또는 거짓(false)을 평가할 수 있는 식
            표현식1 : 조건식이 true일 경우 실행되는 식
            표현식2 : 조건식이 false일 경우 실행되는 식

         */

        int a = 5;
        int b = 3;
        int max = (a > b) ? a : b;
        System.out.println("더 큰 수는 " + max + "입니다.");
        System.out.println("----------------------------");

        int c = 90;
        int d = 120;
        int max2;
        if(c > d){
            max2 = c;
        }
        else{
            max2 = d;
        }
        System.out.println("더 큰 수는 " + max2 + "입니다.");
    }
}
