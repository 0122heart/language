package j16_Bean;

import lombok.Data;

@Data
public class UerEntityLomBok {

    /*
        Lombok
        Java에서 반복적으로 작성해야 하는 코드(boilerplate code)를 자동으로 생성해주는 라이브러리

        장점
        코드의 가독성을 높일 수 있다 -> 주석을 통한 어노테이션을 붙여 코드 생성을 제어할 수 있음.

        종류
        1. @Data
        - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 어노테이션을 한꺼번에 적용해주는 종합 패키지

        2. @NoArgsConstructor
        - 매개변수가 없는 기본 생성자를 생성함.

        3. @AllArgsConstructor
        - 모든 필드를 매개 변수로 받는 생성자를 생성

        4. @Getter / @Setter
        - 각 필드에 대해 getter와 setter 메서드를 생성
        - 클래스 레벨에 사용하면 모든 필드에 대해, 필드 레벨에 사용하면 특정 필드에 대해서만 getter와 setter가 생성

        5. @EqualsAndHashCode
        - equals()와 hashCode() 메서드를 자동으로 생성

        6. @ToString
        - toString() 메서드를 자동으로 생성
        - 객체의 필드 값을 문자열로 표현해주는 메서드


     */

    private String username;
    private String password;
    private String email;
    private String name;

}
