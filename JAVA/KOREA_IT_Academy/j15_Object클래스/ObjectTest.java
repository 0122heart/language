package j15_Object클래스;

/*
    모든 클래스는 Object 클래스를 상속 받는다
 */
public class ObjectTest extends Object{
    // 필드 정의
    private String name;
    private String address;

    // 생성자 정의
    public ObjectTest(){}

    public ObjectTest(String name, String address){
        this.name = name;
        this.address = address;
    }

    // 메소드 정의 - 새로운 방식
    public String showInfo(){
        return "name: " + name + ", address: " + address;
    }

    // 평소에 하던 메소드 정의 방식
//    public void showInfo(){
//        System.out.println("name: " + name + ", address: " + address);
//    }

    @Override
    public String toString(){
        return "name: " + name + ", address: " + address;
    }

    public void setInfo(String name, String address){
        this.name = name;
        this.address = address;
    }
}
