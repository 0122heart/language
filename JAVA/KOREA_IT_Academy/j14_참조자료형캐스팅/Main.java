package j14_참조자료형캐스팅;
/*
    참조 자료형 : Java의 주요 데이터 타입 중 하나, 객체에 대한 참조를 저장하는데 사용 -> 기본 자료형과 달리 객체의 주소를 가리킴.

    1. 참조 자료형 개요
        정의 : 참조 자료형은 객체를 참조(참고)하는 변수 타입
        기능 : 객체의 데이터를 저장하고, 해당 객체의 메소드를 호출하는 등의 작업을 수행
    2. 기본 자료형 vs 참조 자료형
        - 기본 자료형(Primitive Types)
            - 데이터 값을 직접 저장
            - e.g.) int, char, float, boolean
        - 참조 자료형(Reference Types)
            - 사용자 정의 클래스와 JAVA 라이브러리에서 제공하는 클래스
            - e.g.) String, 배열, 사용자 정의 클래스 등
    3. 참조 자료형의 종류
        3-1. 클래스(Class)
        - 사용자 정의 클래스 / JAVA 라이브러리에서 제공하는 클래스
        - e.g.) String, Integer, Scanner, 사용자 정의 클래스
        3-2. 인터페이스(Interface)
        - 클래스가 구현해야 하는 메소드의 집합
        - e.g.) List, Map, Runnable 등
        3-3. 배열(Array)
        - 동등한 타입의 요소들을 저장하는 자료 구조
        - e.g.) int[], String[]
    4. 참조 자료형의 특징
        - Heap 메모리 사용 : 참조 자료형은 객체를 힙 메모리에 저장하고, 변수는 해당 객체의 주소를 참조한다.
        - 초기화 필요 : 참조 자료형 변수는 초기화하지 않으면 null값을 가진다. 이는 객체를 참조하지 않음을 의미.
        - 메모리 관리 : JAVA는 Garbage collection을 통해 사용되지 않는 객체를 메모리에서 해제한다.

        * Heap Memory - 객체와 배열을 저장하는 동적 메모리. JAVA는 메모리 관리를 자동으로 수행하기 때문에 Heap 메모리는 메모리 관리의 중요한 부분을 차지함.
        * Stack MEmory - 메소드 호출 시 생성되는 지역 변수와 매개 변수가 저장되는 메모리 공간 / 메모리 실행이 끝나면 스택 메모리는 자동으로 해제됨.

    5. 업캐스팅(UpCasting) : 하위 클래스 '객체'를 상위 클래스 '타입'으로 변환하는 것. 업캐스팅은 암묵적으로 이루어지며, 명시적인 캐스팅 연산자가 필요하지 않음.
                            상위 클래스 타입의 참조 변수로 하위 클래스 객체를 참조할 수 있음.

    6. 다운캐스팅(DownCasting) : 상위 클래스 타입으로 참조된 '객체'를 다시 하위 클래스 '타입'으로 변환하는 것. 다운 캐스팅은 명시적으로 이루어져야 하며,
                                캐스팅 연산자가 필요. 올바르게 다운캐스팅을 하려면 실제 객체가 해당 하위 클래스의 인스턴스여야 함.

        업캐스팅과 다운캐스팅의 장점과 주의점
            - 장점 :
                유연한 코드 : 업캐스팅을 통해 다양한 하위 클래스 객체를 사우이 클래스 타입으로 다룰 수 있음 -> 각 객체들을 Power 타입으로 업캐스팅하여 중앙통제
                다형성 : 업캐스팅을 통해 다형성을 구현 가능. 상위 클래스 타입으로 메소드를 호출하면, 실제 객체 타입에 따라 오버라이딩된 메소드가 실행
            - 주의점 :
                다운캐스팅 시 안정성 : 다운캐스팅을 할 때에는 항상 실제 객체 타입을 확인해야 함.
                    instanceof 연산자 이용하여 안전하게 캐스팅 가능 -> 잘못된 다운캐스팅은 ClassCastException을 발생시킬 수 있음.
                상위 클래스 메소드만 사용 가능 : 업캐스팅된 상태에서는 상위 클래스에 정의된 메소드만 호출 가능. 하위 클래스에만 있는 메소드를 호출하면 다운 캐스팅이 요구됨 ->
                    Power로 업캐스팅된 computer1, computer2를 다운캐스팅한 이유 -> compute()메소드를 실행시키기 위해서는 다운캐스팅이 필수였기 때문
 */

public class Main {
    public static void main(String[] args) {

        // 각 장치 객체 생성
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(computer1);
        centralControl.addDevice(computer2);
        centralControl.addDevice(led);
        centralControl.addDevice(speaker);

        centralControl.powerOn();
        System.out.println("--------------------------------");

        Tv tv = new Tv();
        centralControl.addDevice(tv);
        Tv tv2 = new Tv();
        centralControl.addDevice(tv2);
        centralControl.powerOn();
        System.out.println("---------------------------------");

        centralControl.powerOff();
        System.out.println("---------------------------------");
        centralControl.performSpecificFunction();


    }
}
