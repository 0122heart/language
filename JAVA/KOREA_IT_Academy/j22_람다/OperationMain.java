package j22_람다;
/*
    람다식 :
        JAVA 8에서 도입된 기능. 익명 함수를 생성하기 위한 표현식.
        코드의 간결성 높이고, 함수형 프로그래밍 요소를 자바에 도입하는데 중요한 역할.

    람다식의 정의 :
        Lambda Expression
        파라미터(매개변수), 화살표 기호, 그리고 body로 이루어짐.

    형식 :
        (parameter) -> body
        (parameter) -> { body }
 */

public class OperationMain {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Operation add = new Operation() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

//        Operation add2 = (int x, int y) -> {
//            return x + y;
//        };
        Operation add2 = (x, y) -> x + y;

        Operation sub = (x, y) -> x - y;

        System.out.println(sub.resultToString(sub.calc(b, a)));

        int addResult = add.calc(a, b);
        System.out.println(a + " + " + b + " = " + addResult);

        // 곱하기와 나누기 정의

        Operation mul = (x, y) -> x * y;
        System.out.println(mul.resultToString(mul.calc(b, a)));
        System.out.println(a + " * " + b + " = " + mul.calc(a, b));
        Operation div = (x, y) -> x / y;
        System.out.println(div.resultToString(div.calc(b, a)));
        System.out.println(b + " / " + a + " = " + div.calc(b, a));
    }
}
