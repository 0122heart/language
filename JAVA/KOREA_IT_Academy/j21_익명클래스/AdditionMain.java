package j21_익명클래스;

public class AdditionMain {
    public static void main(String[] args) {
        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new Addition<Integer>() {
            @Override
            public Integer add(Integer values) {
                System.out.println("Integer로 재정의한 익명 클래스의 add 메소드");
                return 1;
            }
        };

        integerAddition.add(3);
        System.out.println(integerAddition.add(3));
    }
}
