package j17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung {

    // 멤버 변수 정의
    @Getter
    private String company;
    private int serialNumber;

    // 스태틱 변수 정의
    private static Samsung instance = null;

    // 기본 생성자
    private Samsung(){
        company = getClass().getSimpleName();
        serialNumber = 20240000;
    }

    public static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }
}
