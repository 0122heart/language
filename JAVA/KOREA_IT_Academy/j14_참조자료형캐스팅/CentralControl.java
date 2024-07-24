package j14_참조자료형캐스팅;

//여러 장치들을 중앙에서 제어하는 클래스

public class CentralControl {

    // 제어할 장치들을 저장하는 배열 - implicit upCasting
    private Power[] deviceArray;

    // 생성자 : 제어할 장치 배열을 초기화
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 장치를 배열에 추가하는 메소드
    public void addDevice(Power device){
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더이상 장치를 연결할 수 없습니다.");
            System.out.println();
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        System.out.println();
    }

    // Power[] 배열 안의 비어있는 index가 있는지 확인하는 메소드 -> 비어있다면 return i, 그 외 return -1
    private int checkEmpty(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void powerOn(){
        for(int i = 0; i < deviceArray.length; i++){
            // 비어있는 배열 부분에서 powerOn()이 실행되는 것을 막기 위한 베리어!
            if(deviceArray[i] == null) continue; // 배열에 비어있는 부분이 있드면 다음 반복으로 넘어가도록 하는 명령어 continue

            deviceArray[i].on();
        }
    }

    // 향상된 for문 구조로 구현한 powerOff()
    public void powerOff(){
        for (Power power : deviceArray) {
            // 비어있는 배열 부분에서 powerOff()이 실행되는 것을 막기 위한 베리어!
            if (power == null) continue; // 배열에 비어있는 부분이 있드면 다음 반복으로 넘어가도록 하는 명령어 continue

            power.off();
        }
    }

    // 다운 캐스팅을 사용하여 특정 장치의 기능을 호출하는 예쩨 메소드
    public void performSpecificFunction(){
        for(Power device : deviceArray){
            if(device instanceof Computer){
                // Power 타입에서 Computer 타입으로 명시적 다운캐스팅
                Computer computer = (Computer) device;
                computer.compute();
            }
        }
    }

    public void __a(){
        for(Power device : deviceArray){
            if(device instanceof LED){
                LED led = (LED) device;
                led.on();
            }
        }
    }
}
