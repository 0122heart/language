package j18_제네릭;

/*
    제네릭의 개념 및 정의
    제네릭은 클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술

    타입 매개변수(Type Parameter) : 클래스나 메소드에서 사용할 실제 타입을 대신하여 사용하는 매개변수
        일반적으로 알파벳 대문자 한 글자로 표현함. T E K V 등이 자주 사용됨.
        1. T : Type (일반적으로 클래스 타입을 나타낼 때 사용)
        2. E : Element (컬렉션의 요소를 나타낼 때 사용)
        3. K : Key (맵의 키를 나타낼 때 사용)
        4. V : Value (맵의 값 또는 제네릭 타입의 반환 값으로 사용)
    재사용성 : 제네릭을 사용하면 다양한 데이터 타입에 대해 하나의 클래스나 메소드를 정의할 수 있어 코드의 재사용성을 줄이고 중복을 줄입니다.
    타입 안정성(Type Safety) : 컴파일 시점에 타입 체크를 할 수 있어 프로그램의 안정성을 높임. 또한 명시적인 형변환을 줄임
 */

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        // Date 클래스를 import해서 now라는 객체 생성 -> 기본 생성자를 통해
        Date now = new Date();

        ResponseData<String> responseData = new ResponseData<>("날짜 저장 성공: ", now.toString());
        System.out.println(responseData);

        ResponseData<Integer> responseData2 = new ResponseData<>("번호 저장 성공: ", 10);
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData<>("날짜 객체 저장 성공: ", now);
        System.out.println(responseData3);
    }
}
