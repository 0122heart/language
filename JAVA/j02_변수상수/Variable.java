package j02_변수상수;

public class Variable {
    public static void main(String[] args) {
//        // 변수(variable) : 데이터를 담을 수 있는 바구니
//
//        // 논리 자료형 변수 : 참, 거짓으로 판단함
//        boolean checkFlag = false;
//
//        // 자료형 변수명 = 데이터(literal);
//        System.out.println(checkFlag);
//
//        // String name = "박의진";
//        // System.out.println(name);
//
//        // 기존에 선언한 자료형의 값 변경 시 자료형을 명시할 필요 없음
//        checkFlag = true;
//        System.out.println(checkFlag);
//
//        // 문자 자료형 변수! 한 글자만 저장할 수 있음
//        char name1 = '박';
//        char name2 = '의';
//        char name3 = '진';
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//
//        // 쌍따옴표 : 여러 글자를 출력할 수 있다
//        System.out.println("" + name1 + name2 + name3);
//        System.out.println(name1 + name2 + name3);
//
//        // 문자열 자료형 변수 : 쌍따옴표로 구분을 한다
//        String name4 = "박의진";
//        System.out.println(name4);
//        String name5 = name4 + ""; // '='의 의미 : 오른쪽의 값을 왼쪽에 대입하겠다
//        System.out.println(name5);

//        // 정수 자료형 변수
//        int width = 100;
//        int width2 = 200;
//
//        String width3 = "300";
//        String width4 = "400";
//
//        int widthResult = width + width2;
//        String widthResult2 = width3 + width4;
//        System.out.println(widthResult);
//        System.out.println(widthResult2);
//
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//
//        // 실수 자료형 변수
//        double pi = 3.14159;
//        System.out.println(pi);

        // 상수 : 대문자로만 쓰고 스네이크 방식으로 쓰자~ 하고 약속
        final String FILE_PATH = "C:\\Users\\0122heart\\Desktop\\coding\\JAVA_KOREA_IT\\June_27";
        System.out.println(FILE_PATH);
    }
}
