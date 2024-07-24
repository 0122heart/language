package j08_메소드;

import java.util.Scanner;

public class Method1 {
    /*
            Method란? = 함수(Function)
            함수 : 일련의 동작을 묶어서 정의한 것. 입력값과 출력값이 존재.

            함수와 메소드가 같다면 왜 용어를 분리하나?

            클래스 안에 함수를 정의하면 메소드라고 부른다.

            호출 형식

            클래스.메소드명()

           함수 정의 : 특정한 함수를 클래스 내에 만드는 것 -> 메소드라고 알아 들으셔야 합니다.
           함수 호출(call) : main이 있는 곳에서 클래스.메소드명()을 통해서 메소드를 실행시키는 행위
     */
    /*
        1. method : 특정 작업을 수행하는 코드 블럭을 정의하는 방법

        예를 들어 '사진을 찍는다'라는 행위에 대해서 생각해보면,
        1) 주머니에서 폰을 꺼내고,
        2) 잠금 화면을 풀고,
        3) 카메라를 켜고,
        4) 사진을 찍고자 하는 대상에 폰을 조준하고,
        5) 셔터를 누릅니다.

        컴퓨터는 시키는 대로만 하기 때문에 사진을 찍기 위해서는 위의 1~5까지의 명령어를 입력해줘야만 합니다.
        하지만 '사진을 찍는다'라는 함수 내에 1~5명령어들을 다 미리 집어넣고 나서,
        '사진을 찍는다'라는 명령어를 실행시키기만 하면 자동으로 1~5까지의 명령을 순서대로 수행하는 것을 함수의 개념이라고 보시면 됩니다.

        2. 메소드 용어 정리
            2-1. 메소드 정의 : 사용자가 메서드를 새로 만드는 것을 의미
            2-2. 인수(argument) : 사용자 메소드에 전달할 입력(input)을 의미
            2-3. 매개변수(parameter) : 인수를 받아서 저장하는 변수를 의미
            2-4. 반환값/출력값/리턴값(return) : 사용자 메소드의 출력(output)
            2-5. 메서드 호출 : 만들어진 사용자 메소드를 실제로 사용하는 것을 의미

     */

    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println(" [ x | x ]");
    }

    // 2. [ o | x ]
    public static void call2(String str) {              // 클래스.메소드명(매개변수)
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + str);
    }

    // 3. [ x | o ]
    public static String call3() {                      // 출력값의 자료형이 String이어야 함을 명시
        System.out.println("[ x | o ]");

        String result = "";

        for(int i = 0; i < 5 ; i++) {
            for(int j = 0 ; j < i + 1 ; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int day) {
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + day + "일";
    }

    public static void main(String[] args) {
//        call1();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("오늘의 다짐을 적어주세요 : ");
//        String todayFeeling = sc.nextLine();
//        call2(todayFeeling); // 메소드명(인수)
//        String starWriting = call3();
//        System.out.println(starWriting);
        System.out.println(call3());
//        String date = call4(2024, 07, 04);
//        System.out.println(date);
//        String birthday = call4(1988, 7, 9);
//        System.out.println(birthday);
    }
}