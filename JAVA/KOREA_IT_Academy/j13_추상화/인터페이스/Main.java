package j13_추상화.인터페이스;

public class Main {
    /*
        인터페이스

        인터페이스는 자바에서 클래스가 구현해야 하는 메소드들의 집합을 정의하는 일종의 규약(protocol)
        인터페이스는 메소드의 시그니처(메소드 이름, 반환 타입, 매개변수 목록)만을 포함하며, 메소드의 실제 구현은 포함하지 않음.
        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음.

        특징
        1. 추상 메소드 : 인터페이스 내의 모든 메소드는 기본적으로 추상 메소드 -> 즉, 메소드 선언만 있고 구현은 없다.
        2. 상수 : 인터페이스 내에서 선언된 변수는 '자동으로' 'public static final' 상수로 취급합니다.
        3. 다중 상속 : 클래스는 여러 인터페이스를 구현할 수 있다.

        추상클래스와의 공통점
            - 모든 추상 메소드를 포함할 수 있고, 서브 클래스 / 구현 클래스에서 이를 구현해야 한다.

        추상클래스와의 차이점
            추상클래스
                1. 부분 구현 허용 : 추상 클래스는 추상 메소드 뿐만 아니라 일반 메소드(구현이 포함된 메소드)도 포함할 수 있다.(추상클래스 패키지의 Factory.java 확인하면 됨)
                2. 상태 저장 가능 : 추상 클래스 인스턴스 변수(상태)를 가질 수 있다.
                3. 단일 상속 : 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
                4. 생성자 : 추상 클래스는 생성자를 가질 수 있다.
                5. 다양한 접근 제어자 : 추상 클래스의 메소드와 변수는 다양한 접근 제어자(public, protected, private)를 가질 수 있다.

            인터페이스
                1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메소드가 추상 메소드.(Java 8 이후에 default, static 메소드를 사용할 수 있긴 함)
                2. 인터페이스는 인스턴스 변수를 가질 수 없고, 상수만 선언 가능
                3. 다중 상속 : 클래스는 여러 인터페이스를 구현할 수 있다.
                4. 생성자 없음 : 인터페이스는 생성자를 가질 수 없음
                5. 자동 public : 인터페이스의 메소드는 자동으로 public이며, 메소드 선언에 접근 제어자를 명시할 필요가 없음
     */

    public static void main(String[] args) {

        // RemoteControl 객체 생성(인수로 PowerButton(), VolumeUpButton(), VolumeDownButton()을 이용)
        RemoteControl remoteControl = new RemoteControl(new PowerButton(), new VolumeUpButton(), new VolumeDownButton(),
                new ChannelUpButton(), new ChannelDownButton());

        remoteControl.onPressedPowerButton();
        remoteControl.onPressedPowerButton();
        System.out.println();
        remoteControl.onPressedVolumeDownButton();
        remoteControl.onPressedVolumeUpButton();
        remoteControl.onDownVolumeUpButton();
        remoteControl.onDownVolumeDownButton();
        System.out.println();
        remoteControl.onPressedChannelUpButton();
        remoteControl.onPressedChannelDownButton();
        remoteControl.onDownChannelUpButton();
        remoteControl.onDownChannelDownButton();

        // 원래 메인에서 전원 버튼 구현하려고 하면
        boolean status = false;
        if(!status){
            status = true;
            System.out.println("전원을 켭니다.");
        }
        else{
            status = false;
            System.out.println("전원을 끕니다.");
        }


    }
}
