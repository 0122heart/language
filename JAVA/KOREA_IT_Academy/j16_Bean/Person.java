package j16_Bean;

public class Person {
    private final String name;  // 멤버 변수에 final을 선언하면 필수값이 됨
    private int age;

    //public Person(){} // @NoArgsConstructor에 해당하는데 @RequiredArgsConstructor와 함께 쓸 수 없음.
    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){ // @AllArgsConstructor : 모든 멤버 변수를 매개변수로 받는 생성자
        this.name = name;
        this.age = age;
    }

}
