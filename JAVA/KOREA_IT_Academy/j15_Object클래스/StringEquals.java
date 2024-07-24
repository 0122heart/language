package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        String name1 = "바그진";
        String name2 = "바그진";
        String name3 = new String("바그진");
        String name4 = new String("바그진");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name3 == name4);

        System.out.println();
        System.out.println(name1.equals(name3));

    }

    /*
        name1 == name2 : true
        자바는 문자열 리터럴을 상수에 저장하기 때문에 두 변수는 동일한 메모리 주소를 참조하여 true를 반환

        name1 == name3 : false
        name3는 new String("바그진")을 통해 생성, 이는 새로운 String 객체를 heap메모리에 생성하고 그 주소를 반환하므로,
        name1과 name3는 서로 다른 메모리 주소를 창조함. 따라서 false 반환

        name3 == name4 : false
        name4도 new String("바그진")을 통해 생성되어서, 새로운 객체이므로 name3와 name4는 서로 다른 메모리 주소를 창조함.
        따라서 false를 반환

        name1.equals(name3) : true
        String에서의 메소드 equals()는 문자열의 내용을 비교함. name1과 name3가 모두 "바그진"이라는 문자열 값을 가지므로 true 반환
     */
}
