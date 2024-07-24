package j21_익명클래스;

public class AdditionImpl<T> implements Addition<T> {
    @Override
    public T add(T values) {
        // 전달된 데이터를 출력하고 반환
        System.out.println(values + " 데이터들을 합칩니다.");
        return values;
    }
}
