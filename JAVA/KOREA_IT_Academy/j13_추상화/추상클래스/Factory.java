package j13_추상화.추상클래스;

public abstract class Factory {

    /*
        abstract : 추상적인

        추상클래스
        1. 추상 메소드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의되어야 한다.
        2. 추상 클래스는 객체를 생성할 수 없다.
        3. 그 외의 다른 특징은 일반 클래스와 동일하다.
     */

    private String name;

    public Factory(String name){
        this.name = name;
    }

    public abstract void produce(String model);
    public abstract void management();

    public String getName(){
        return name;
    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 : " + name);
    }
}

/*
    추상 클래스 : 추상 메소드가 하나 이상인 클래스
    추상 메소드 : 선언만 있고, 구현은 되어있지 않은 메소드

    추상 클래스의 장점 :
    코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

    추상 클래스의 목적 :
    1. 공통된 기닁 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의할 수 있다.
    2. 구체적인 구현 강제 : 추상 메소드를 통해 하위 클래스가 반드시 특정 메소드를 구현하도록 강제할 수 있다.
    3. 코드의 재사용성 : 중복되는 코드를 줄이고, 유지보수성을 높일 수 있다.

    추상 클래스에서의 주의할 점 :
    추상 클래스는 객체를 생성할 수 없다.

    super 키워드 - 상위 클래스의 멤버에 접근하기 위해서 사용
    1. 하위 클래스에서 상위 클래스의 생성자를 호출할 때 사용 -> super(매개변수)
    2. 하위 클래스에서 상위 클래스의 메소드를 호출할 때 사용 -> super.메소드명()

 */