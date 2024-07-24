package j17_스태틱.빌더;

import lombok.Builder;
import lombok.ToString;

@Builder // 빌더 패턴을 생성하는 어노테이션
@ToString // toString 패턴을 생성하는 어노테이션
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;

    // User2 인스턴스를 User 인스턴스로 변환하는 메소드
    public User to(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }

}
