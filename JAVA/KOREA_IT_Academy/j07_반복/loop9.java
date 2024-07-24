package j07_반복;

public class loop9 {
    public static void main(String[] args) {
        /*
            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
         */

        int n = 5;
        for(int i = 0; i < 2 * n - 1; i++) {
            if (i < 5) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int j = 0; j < 2 * n - i - 1 ; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 증가 패턴
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 감소 패턴
        for(int i = n - 1; 1 <= i; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
