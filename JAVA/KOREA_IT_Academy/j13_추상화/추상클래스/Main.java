package j13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory = new TabletFactory("애플 태블릿 공장");

        phoneFactory.produce("아이폰16"); // Factory에서의 추상 메소드를 자식 클래스인 PhoneFactory에서 구현한 메소드
        tabletFactory.produce("아이패드 프로 8"); //

        phoneFactory.printInfo(); // 부모 클래스인 Factory에서 가져온 (추상이 아닌) 메소드
        tabletFactory.printInfo();

        // Factory factory = new Factory("그냥 공장"); -> 추상 클래스이기 때문에 객체 생성이 불가능함
    }
}
