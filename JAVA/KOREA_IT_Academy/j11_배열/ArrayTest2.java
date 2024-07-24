package j11_배열;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
            몇 명의 학생을 등록할 건지 입력 받은 후 반복문을 돌면서 studentNames 배열에 각 학생들의 이름을 받아 저장하는 프로그램을 구현하시오

            실행 예시

            몇 명의 학생을 등록하시겠습니까? >>> 3
            1번 학생 이름 : 강서정
            2번 학생 이름 : 강우주
            3번 학생 이름 : 김강민
            4번 학생 이름 : 김유정
            5번 학생 이름 : 박다혜
            6번 학생 이름 : 박의진
            7번 학생 이름 : 박주환
            8번 학생 이름 : 송명기
            9번 학생 이름 : 송유하
            10 학생 이름 : 송하얼

            [출력 결과]
            1. 강서정
            2. 강우주
            3. 김강민
            4. 김유정
            5. 박다혜
            6. 박의진
            7. 박주환
            8. 송명기
            9. 송유하
            10. 송하얼
         */

        //  몇 개짜리 방의 배열을 만들 것인가를 count 변수에 초기화
        int count = 0;

        // 비어있는 String 배열 생성
        String[] studentNames = null;  // 선언

        // 입력받기 위한 scanner클래스 import
        Scanner scanner = new Scanner(System.in);

        // count 변수에 배열의 인덱스 수를 대입
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        count = scanner.nextInt();

        // nextInt()후 enter키를 studentnames[i] = scanner.nextLine(); 이 부분이 인식하기 때문에 문제 생김
        scanner.nextLine();

        studentNames = new String[count]; // count 개수로 초기화

//        System.out.println("배열의 크기 : " + studentNames.length);
        // 학생을 입력하는 반복문
        for(int i = 0; i < studentNames.length; i++){
            System.out.print((i + 1) + "번 학생 이름 : ");
            studentNames[i] = scanner.nextLine();
        }

        System.out.println("[출력결과]");
        // 배열의 요소를 출력하는 반복문
        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + studentNames[i]);
        }
    }
}
