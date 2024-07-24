package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        // 빌더를 통한 User 인스턴스 생성

        User user = User.builder()
                .email("0122heart@pusan.ac.kr")
                .username("박의진")
                .build();

        // User 클래스의 toString 어노테이션으로 주소값이 아닌 String 형태가 콘솔에 찍힘
        System.out.println(user);

        User2 user2 = User2.builder()
                .name("박의진")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);
    }
}
