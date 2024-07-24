package j07_반복;

public class loop6 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n; i++){
            System.out.println(i + 1);
        }

        // 재정의는 자료형 선언 없음! 재정의가 아니라 최초 선언이다
        int i = 0;

        while(i < n){
            System.out.println(i + 1);
            i++;
        }
    }
}
