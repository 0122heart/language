package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // up casting : 범위가 큰 자료형으로 바꿔주는 것
        char cast1 = 'A';
        System.out.println((int) cast1); // 첫번째 방법
        System.out.println(cast1);
        int cast2 = cast1;  // 두번째 방법
        System.out.println(cast2);

        // down casting : 범위가 작은 자료형으로 바꿔주는 것
        int cast3 = 98;
        System.out.println(cast3);
        char cast4 = (char) cast3;
        System.out.println(cast4);
    }
}
