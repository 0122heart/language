package j07_반복;

public class loop8 {
    public static void main(String[] args) {
        // 별찍기

        /*
            *
            **
            ***
         */

        // 별찍기 1
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 별찍기 2
        for(int i = 0; i < 3; i++){
            for(int j = 3 - i; 0 < j; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        int n = 3;
        for(int i = n; 0 < i; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
