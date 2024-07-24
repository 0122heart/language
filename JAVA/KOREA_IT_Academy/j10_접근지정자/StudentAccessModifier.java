package j10_접근지정자;

public class StudentAccessModifier {
    /*
        접근지정자(Access Modifier) :
        클래스, 메소드, 변수 등에 대한 접근 권한을 제어하는 데 사용됨.

        종류 :
        1. public : 모든 클래스에서 접근할 수 있음. -> 어디서나 접근 가능하다는 뜻

        2. protected : 같은 패키지 내의 클래스 및 이 클래스를 상속받은 자식 클래스에서 접근 가능.

        3. default(package-private) : 접근지정자를 명시하지 않으면 default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능

        4. private : 같은 클래스 내에서만 접근 가능.
     */

    private int code;
    private String name;

    public StudentAccessModifier(int code, String name){
        this.code = code;
        this.name = name;
    }

    public void setCode(int code){
        this.code = code;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCode(){
        return code;
    }

    /*
        1. getName 메소드를 정의할 것
        2. StudentAccessModifierMain에 setName이용해서 수강생 본인 이름으로 설정할 것.
        3. StudentAccessModifier에 showInfo 메소드를 정의할 것
        4. StudentAccessModifierMain에 showInfo를 이용하여 code와 name을 출력할 것
     */

    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println("code : " + this.code);
        System.out.println("name : " + this.name);
    }
}
