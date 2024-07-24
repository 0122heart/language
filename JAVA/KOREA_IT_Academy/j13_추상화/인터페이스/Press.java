package j13_추상화.인터페이스;

public interface Press {
    public final String NAME = "button"; // 상수 선언 및 초기화

    public void onPressed();

    // 안되는 것들 예시
//    private String name;  // 변수 선언 불가능
//    public Press();  // 생성자 생성 불가능
//    public default void pop(){  // 일반 메소드 정의 불가능
//
//    }
}
