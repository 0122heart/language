package j14_참조자료형캐스팅;

public class Computer implements Power{
    @Override
    public void on(){
        System.out.println("컴퓨터의 전원을 킵니다.");
    }

    @Override
    public void off(){
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    // 다운캐스팅을 위한 사전 준비
    public void compute(){
        System.out.println("컴퓨터에서 계산을 수행합니다.");
    }
}
