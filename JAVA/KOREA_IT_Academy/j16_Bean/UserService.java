package j16_Bean;

// 서비스 객체(비지니스 로직)
public class UserService {
    /*
        기능
        메서드들의 집합

        Entity 클래스 : 주로 데이터베이스 테이블과 매핑되는 클래스
        일반적으로 애플리케이션(=프로그램)의 데이터 모델을 정의하며, 데이터베이스와의 상호작용을 위해 사용됨.

        주요 특징
        데이터베이스 테이블 매핑 : Entity클래스는 데이터 베이스 테이블의 구조와 일치
        필드와 칼럼 매핑 : 클래스의 필드는 데이터베이스 테이블의 칼럼과 매핑
        식별자 : 일반적으로 @id 어노테이션을 사용하여 기본 키(prime key)를 지정
        어노테이션 사용 : @Entity @Table @Column 등의 어노테이션을 사용

        Service 클래스 : 비지니스 로직을 구현하는 클래스. 이 클래스는 에플리케이션의 비지니스 규칙을 처리하며, 데이터의 변환, 검증, 처리 등을 수행
        보통 Repository 클래스를 사용하여 데이터베이스와 상호작용함.

        비지니스 클래스 : 애플리케이션의 비지니스 로직을 처리
        보통 도메인 논리를 캡슐화하고, 특정 비지니스 규칙을 구현

        Bean : Java에서 Bean은 특정한 규칙을 따르는 자바 객체를 의미함.
        규칙
            1. private : 모든 속성은 private로 선언되어 외부에서 직접 접근 불가
            2. public getter and setter : 각 속성에 대해 public 접근자, 설정자 메서드가 존재함
            3. No-Argument COnstructor : 기본생성자를 가지고 있어야 함
            4.
        사용 이유 :
            Bean은 재사용 가능하고 관리 가능한 구성 요소를 만들어 코드의 모듈성을 높이고, 유지 보수를 용이하게 만드는 데 중요한 역할을 함.
     */
}
