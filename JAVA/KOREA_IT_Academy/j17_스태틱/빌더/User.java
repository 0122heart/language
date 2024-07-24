package j17_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    /*
        디자인 패턴
        소프트웨어 디자인에서 자주 발생하는 문제에 대한 전형적인 해결책,
        특정 설계 문제를 해결하기 위해 맞춤화할 수 있는 미리 만들어진 청사진/설계도와 같습니다.

        1. 생성 패턴(Creational Patterns) : 객체 생성 메커니즘을 다루며, 상황에 맞게 객체를 생성할 때 사용
            e.g.) 싱글톤, 팩토리, 빌더, 프로토 타입
        2. 구조 패턴(Structural Patterns) : 객체 구성이나 구조
            e.g.) 어댑터, 컴포지트, 프록시. 플라이웨이트, 퍼사드, 브리지
        3. 행위 패턴(Behavioral Patterns) : 객체 간의 상호작용과 책임 분담
            e.g.) 옵저버, 전략, 커맨드, 반복자, 미디에이터, 상태, 방문자

        1) 빌더 패턴
            복잡한 객체를 단계별로 생성하는 방법을 제공하는 생성 패턴.
            복잡한 객체의 생성 과정과 표현을 분리하여 동일한 생성 과정으로 다른 표현을 만들 수 있도록 함.
            선택적 속성이 있는 객체를 생성해야 하거나 생성 과정이 여러 단계로 이루어질 때 유용

            특징 :
                1-1) 불변 객체 : 생성된 객체가 불변임을 보장
                1-2) 유연한 인터페이스 : 메소드 체이닝을 사용하여 속성을 설정하므로 코드를 더 읽기 쉽게 사용 가능
                1-3) 관심사 분리 : 빌더 크래스는 생성 과정을 처리, 메인 클래스는 표현에 중점
     */

    private String username;
    private String password;
    private String email;
    private String name;

    // 빌더 패턴을 구현하는 정적 중첩 클래스
    public static class UserBuilder{
        private String username;
        private String password;
        private String email;
        private String name;

        public UserBuilder username(String username){
            this.username = username;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        // User 인스턴스를 생성하고 반환하는 메소드
        public User build(){
            return new User(username, password, email, name);
        }
    }

    // 새로운 UserBuilder 인스턴스를 반환하는 정적 메소드
    public static UserBuilder builder(){
        return new UserBuilder();
    }
}
