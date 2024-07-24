package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();

        System.out.println(objectTest);
        int hashCode = objectTest.hashCode();

        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode));

        objectTest.setInfo("박으진", "금정구");

        System.out.println(objectTest);

        /*
            hashCode는 객체의 고유한 정수 값을 반환하는 메서드 -> 해당 정수 값은 객체의 메모리 주소 혹은 상태를 기반으로 생성

            1. 기본 구현 : 기본적으로 Object 클래스의 hashCode()는 객체의 메모리 주소를 기반으로한 정수 값을 반환 -> 하지만 대부분 클래스에서 재정의됨.
            2. 재정의 필요성 : 커스텀 클래스를 만들 때, equals() 메소드를 재정의 했다면 hashCode()메소드도 반드시 재정의할 필요가 있음 -> 두 메소드의 일관성을 이유로
            3. 규약 :
                - 일관성 : 같은 객체에 대해 여러 번 호출된 hashCOde 메소드는 항상 동일한 정수 값ㅇ르 반환해야 함 -> 객체의 상태가 변경되지 않는다면
                - 동등 객체 : 두 객체가 equals() 메소드에 따라 같은 값이라면, 즉 true가 반환된다면, 두 객체의 hashCode 값도 동일해야 함
                - 서로 다른 객체 : 두 객체가 서로 다르더라도 반드시 다른 hashCode 값을 반환할 필요는 없음 -> 하지만 다른 값을 반환하는 것이 hashTable의 성능을 향상시킬 수 있음
         */
    }
}
