package j09_클래스;

public class Constructor {

    /*
        생성자(Constructor)
        생성자는 객체가 생성될 때 호출되는 특별한 메소드.

        특징
        1. 클래스의 이름과 생성자의 이름은 동일하다.
        (즉, 다른 메소드들과 달리 대문자로 시작한다.)
        2. 반환값이 없다.
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.

        생성자의 정의 방식
        1. 기본 생성자(default constructor) : 매개변수가 없는 생성자
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자 -> 매개변수 생성자를 정의할 경우 디폴트 생성자를 정의하지 않으면 디폴트 생성자 호출 불가능!
     */

    int num;
    String name;


    // 기본 생성자
    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int num){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 하는 생성자)");
        this.num = num;
    }

    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 하는 생성자)");
        this.name = name;
    }

    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    // 객체 정보를 출력하는 메소드
    void showInfo(){
        System.out.println("num : " + num);
        System.out.println("name : " + name);
    }
}
